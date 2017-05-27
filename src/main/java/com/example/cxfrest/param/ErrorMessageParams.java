package com.example.cxfrest.param;

/**
 * @author Westlake
 */
public class ErrorMessageParams {
    private String errorMessage;

    public ErrorMessageParams() {
    }

    public ErrorMessageParams(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
