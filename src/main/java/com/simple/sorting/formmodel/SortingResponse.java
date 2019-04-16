package com.simple.sorting.formmodel;

import java.util.List;

/**
 *
 * @author vijay
 */
public class SortingResponse {
    
    List inputRequest;
    List outputResponse;
    List noOfPositionChanged;
    long timeTaken;

    public List getInputRequest() {
        return inputRequest;
    }

    public void setInputRequest(List inputRequest) {
        this.inputRequest = inputRequest;
    }

    public List getOutputResponse() {
        return outputResponse;
    }

    public void setOutputResponse(List outputResponse) {
        this.outputResponse = outputResponse;
    }

    public List getNoOfPositionChanged() {
        return noOfPositionChanged;
    }

    public void setNoOfPositionChanged(List noOfPositionChanged) {
        this.noOfPositionChanged = noOfPositionChanged;
    }

  
    public long getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(long timeTaken) {
        this.timeTaken = timeTaken;
    }


    
}
