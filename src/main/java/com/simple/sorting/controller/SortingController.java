package com.simple.sorting.controller;


import com.simple.sorting.formmodel.SortingResponse;
import com.simple.sorting.exception.SortingException;
import com.simple.sorting.service.SortingImpl;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/")
public class SortingController {

    @Autowired
    public SortingImpl numberSortingImpl;
    
    public String ERROR_MESSAGE="Please check the input and try again";

    @RequestMapping
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(path = "sort",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String processSort(@RequestParam String sortingRequest,Map<String, Object> model ) throws SortingException {
        try{
        SortingResponse sortingResponse= numberSortingImpl.sortNumberInAsc(sortingRequest);
        model.put("input", sortingResponse.getInputRequest());
        model.put("output", sortingResponse.getOutputResponse());
        model.put("timeTaken", sortingResponse.getTimeTaken());
        model.put("positionChanged", sortingResponse.getNoOfPositionChanged());
        }catch(SortingException se){
            model.put("error", ERROR_MESSAGE);
        }
        return "welcome";
    }
}
