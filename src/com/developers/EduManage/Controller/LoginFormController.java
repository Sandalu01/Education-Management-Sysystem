package com.developers.EduManage.Controller;

import com.developers.EduManage.model.user;
import com.developers.EduManage.db.database;
import com.developers.EduManage.utill.secrety.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Optional;

public class LoginFormController {
    public AnchorPane contex;
    public TextField txtpassword;

    public TextField txtxtemzil;

    public void fogotpasswordonaction(ActionEvent actionEvent) {
        //this code can be used in java at version 1.8
    }

    public  void loginonaction(ActionEvent actionEvent) throws IOException {
        String email = txtxtemzil.getText().toLowerCase();
        String password = txtpassword.getText().trim();
        Optional<user> first = database.
                usertable.stream().filter(user -> user.getEmail().equals(email)).findFirst();
            if(first.isPresent()) {
                if (new PasswordManager().checkPassword(password,first.get().getPassword())){ //2nd database
                    setui("DashBoard");
                }
                else {
                    new Alert(Alert.AlertType.ERROR,
                            "Wrong password").show();
                }
            }
            else{
                new Alert(Alert.AlertType.WARNING,
                        String.format("user not found", email)).show();
            }


        /*for (user user : database.usertable) {
            if (user.getEmail().equals(email)) {
                if (user.getPassword().equals(password)) {
                    System.out.printf(user.toString());
                    //sucess
                    return;
                } else {
                    new Alert(Alert.AlertType.ERROR,
                            "Wrong password").show();
                }
                return;
            }
        }
        new Alert(Alert.AlertType.WARNING,
                String.format("user not found",email)).show();

    }*/

    }



    public void createanaccountonaction(ActionEvent actionEvent) throws IOException {
        setui("SignupForm");
    }
    private  void setui(String location) throws IOException {
        Stage stage =(Stage) contex.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.centerOnScreen();


    }
}
