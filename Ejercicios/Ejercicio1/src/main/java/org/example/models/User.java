package org.example.models;

public class User {
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
