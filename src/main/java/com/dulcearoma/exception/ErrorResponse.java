package com.dulcearoma.exception;

import java.util.Map;

public class ErrorResponse {

    private Integer status;

    private String message;

    private Map<String, String> errors;

    public ErrorResponse() {
    }

    public ErrorResponse(
            Integer status,
            String message,
            Map<String, String> errors
    ) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

}
