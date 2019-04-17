package com.simple.sorting.form;

import java.util.List;

/**
 *
 * @author vijay
 */
public class SortingResponse {
    
    private List<Integer> inputRequest;
    private List<Integer> outputResponse;
    private List<String> noOfPositionChanged;
    private long timeTaken;

    public List<Integer> getInputRequest() {
        return inputRequest;
    }

    public void setInputRequest(List<Integer> inputRequest) {
        this.inputRequest = inputRequest;
    }

    public List<Integer> getOutputResponse() {
        return outputResponse;
    }

    public void setOutputResponse(List<Integer> outputResponse) {
        this.outputResponse = outputResponse;
    }

    public List<String> getNoOfPositionChanged() {
        return noOfPositionChanged;
    }

    public void setNoOfPositionChanged(List<String> noOfPositionChanged) {
        this.noOfPositionChanged = noOfPositionChanged;
    }

    public long getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(long timeTaken) {
        this.timeTaken = timeTaken;
    }


    
}
