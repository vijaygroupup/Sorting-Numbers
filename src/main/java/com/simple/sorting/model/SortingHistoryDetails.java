package com.simple.sorting.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SortingHistoryDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sortId;
    @Column
    private String inputToSort;
    @Column
    private String sortedOutput;
    @Column
    private Long timeTakenToSort;
    @Column
    private String changeInIndexPosition;

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getInputToSort() {
        return inputToSort;
    }

    public void setInputToSort(String inputToSort) {
        this.inputToSort = inputToSort;
    }

    public String getSortedOutput() {
        return sortedOutput;
    }

    public void setSortedOutput(String sortedOutput) {
        this.sortedOutput = sortedOutput;
    }

    public Long getTimeTakenToSort() {
        return timeTakenToSort;
    }

    public void setTimeTakenToSort(Long timeTakenToSort) {
        this.timeTakenToSort = timeTakenToSort;
    }

    public String getChangeInIndexPosition() {
        return changeInIndexPosition;
    }

    public void setChangeInIndexPosition(String changeInIndexPosition) {
        this.changeInIndexPosition = changeInIndexPosition;
    }


}
