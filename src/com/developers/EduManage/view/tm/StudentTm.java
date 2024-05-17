package com.developers.EduManage.view.tm;

import javafx.scene.control.Button;

import java.awt.*;

public class StudentTm {
    private String id;
    private String dob;
    private String fullname;
    private String address;
    private Button btn;// java FX button

    @Override
    public String toString() {
        return "StudentTm{" +
                "id='" + id + '\'' +
                ", dob='" + dob + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", btn=" + btn +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public Button getBtn() {
        return btn;
    }

    public StudentTm() {
    }

    public StudentTm(String id, String dob, String fullname, String address, Button btn) {
        this.id = id;
        this.dob = dob;
        this.fullname = fullname;
        this.address = address;
        this.btn = btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
