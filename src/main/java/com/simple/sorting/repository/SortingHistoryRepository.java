package com.simple.sorting.repository;

import com.simple.sorting.model.SortingHistoryDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortingHistoryRepository extends CrudRepository<SortingHistoryDetails, String>{
    
}
