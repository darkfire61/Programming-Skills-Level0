package org.blindmaiden.example.models;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer flagSession = 0;
    private String name;
    private String lastName;
    private String programName;
    private String campusSelect;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getCampusSelect() {
        return campusSelect;
    }

    public void setCampusSelect(String campusSelect) {
        this.campusSelect = campusSelect;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", flagSession=" + flagSession +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", programName='" + programName + '\'' +
                ", campusSelect='" + campusSelect + '\'' +
                '}';
    }
}
