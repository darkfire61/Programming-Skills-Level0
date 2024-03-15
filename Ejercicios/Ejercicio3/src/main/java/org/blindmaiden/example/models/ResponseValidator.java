package org.blindmaiden.example.models;

public class ResponseValidator {
    private String username;
    private String password;

    private Integer flagSession = 0;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFlagSession() {
        return flagSession;
    }

    public void setFlagSession(Integer flagSession) {
        this.flagSession = flagSession;
    }

    public ResponseValidator(String username, String password, Integer flagSession) {
        this.username = username;
        this.password = password;
        this.flagSession = flagSession;
    }
}
