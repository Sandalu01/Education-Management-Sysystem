package com.developers.EduManage.model;

public class user {
    private String FirstNAme;
    private String LastNAme;
    private String Email;
    private String Password;

    public user(String firstNAme, String lastNAme, String email, String password) {
        FirstNAme = firstNAme;
        LastNAme = lastNAme;
        Email = email;
        Password = password;
    }

    public user() {
    }

    public user(String firstNAme) {
        FirstNAme = firstNAme;
    }

    public String getFirstNAme() {
        return FirstNAme;
    }

    public void setFirstNAme(String firstNAme) {
        this.FirstNAme = firstNAme;
    }

    public String getLastNAme() {
        return LastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.LastNAme = lastNAme;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "FirstNAme='" + FirstNAme + '\'' +
                ", LastNAme='" + LastNAme + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}

