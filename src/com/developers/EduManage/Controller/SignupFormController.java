package com.developers.EduManage.Controller;

import com.developers.EduManage.db.database;
import com.developers.EduManage.model.user;
import com.developers.EduManage.utill.secrety.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupFormController {
    public TextField txtxpassword;
    public TextField txtfirstname;
    public TextField txtxlastname;
    public TextField txtxemail;
    public AnchorPane context;

    public void signuponaction(ActionEvent actionEvent) throws IOException {
        String email=txtxemail.getText().toLowerCase();
        String Firstname=txtfirstname.getText();
        String lastname=txtxlastname.getText();
        String password=new PasswordManager().Encript(txtxpassword.getText().trim());
        database.usertable.add(new user(email,password,lastname,Firstname));
        new Alert(Alert.AlertType.INFORMATION,"welcome").show();
        SetUi("LoginForm");
    }

    public void alreadyhaveanaccountonaction(ActionEvent actionEvent) throws IOException {
        SetUi("loginForm");

    }
    private void SetUi(String location) throws IOException {
        Stage stage =(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.centerOnScreen();
    }

}
