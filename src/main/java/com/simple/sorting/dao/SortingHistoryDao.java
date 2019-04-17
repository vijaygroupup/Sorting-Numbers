package com.simple.sorting.dao;

import com.simple.sorting.form.SortingResponse;
import com.simple.sorting.model.SortingHistoryDetails;
import com.simple.sorting.repository.SortingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SortingHistoryDao {

    @Autowired
    SortingHistoryRepository sortingHistoryRepository;

    @Transactional
    public void saveSortedDetails(SortingResponse sortingResponse) {
         sortingHistoryRepository.save(mapResponseToRepo(sortingResponse));
    }

    SortingHistoryDetails mapResponseToRepo(SortingResponse response) {
        SortingHistoryDetails historyDetails = new SortingHistoryDetails();
        historyDetails.setInputToSort(response.getInputRequest().toString());
        historyDetails.setSortedOutput(response.getOutputResponse().toString());
        historyDetails.setTimeTakenToSort(response.getTimeTaken());
        historyDetails.setChangeInIndexPosition(response.getNoOfPositionChanged().toString());
        return historyDetails;
    }
}
