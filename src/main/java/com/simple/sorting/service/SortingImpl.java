package com.simple.sorting.service;

import com.simple.sorting.exception.SortingException;
import com.simple.sorting.dao.SortingHistoryDao;
import com.simple.sorting.formmodel.SortingResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortingImpl {
    
    @Autowired
    SortingHistoryDao sortingHistoryDao;
    
    public SortingResponse sortNumberInAsc(String inputNumbers) throws SortingException {
       
        LocalDateTime startDateTime = LocalDateTime.now();
        SortingResponse sortingResponse = null;
         try{
        List<Integer> inputList = Stream.of(inputNumbers.replaceAll("\\s", "").split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> outputList = inputList.stream().sorted()
                .collect(Collectors.toList());
        
        List changeInIndexPosition = findChangeInIndexPosition(inputList, outputList);
        sortingResponse= new SortingResponse();
        sortingResponse.setInputRequest(inputList);
        sortingResponse.setOutputResponse(outputList);
        sortingResponse.setNoOfPositionChanged(changeInIndexPosition);
        LocalDateTime endDateTime = LocalDateTime.now();
        sortingResponse.setTimeTaken(Math.abs(Duration.between(startDateTime, endDateTime).toMillis()));
        sortingHistoryDao.saveSortedDetails(sortingResponse);
        }catch(Exception e){
        throw new SortingException(e.getMessage());
        }
        return sortingResponse;
    }
    
    List findChangeInIndexPosition(List inputList, List outPutList) {
        
        List positionChange = new ArrayList();
        for (int i = 0; i < outPutList.size(); i++) {
            int indexposition = findIndex(inputList, (int) outPutList.get(i));
            if (indexposition != -1) {
                positionChange.add(outPutList.get(i) + "(" + (indexposition - i) + ")");
            }
        }
        return positionChange;
    }
    
    public static int findIndex(List inputList, int sortedNumber) {
        int len = inputList.size();
        return IntStream.range(0, len)
                .filter(i -> sortedNumber == (int) inputList.get(i))
                .findFirst()
                .orElse(-1);
    }
}
