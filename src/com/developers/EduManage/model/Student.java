package com.developers.EduManage.model;

import java.util.Date;

public class Student {
    private String studentid;
    private String fullname;

    public Student(String format, String text, String text1, String text2) {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }

    public Student() {
    }

    public Student(String studentid, String fullname, String address, Date date) {
        this.studentid = studentid;
        this.fullname = fullname;
        this.address = address;
        this.date = date;
    }

    private String address;
    private Date date;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
