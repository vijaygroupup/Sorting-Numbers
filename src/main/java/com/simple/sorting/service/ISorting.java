package com.simple.sorting.service;

import com.simple.sorting.exception.SortingException;
import com.simple.sorting.form.SortingResponse;
import org.springframework.stereotype.Component;

@Component
public interface ISorting {
    
    public SortingResponse sortNumberInAsc(String inputNumbers) throws SortingException;
}
