package org.blindmaiden.example.models;

public class ResponseValidate {
    private String message;
    private boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseValidator{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }

    public ResponseValidate(String message, boolean status) {
        this.message = message;
        this.status = status;
    }
}
