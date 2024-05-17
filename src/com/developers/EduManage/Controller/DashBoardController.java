package com.developers.EduManage.Controller;

import com.sun.xml.internal.ws.util.xml.CDATA;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class   DashBoardController {
    public AnchorPane context;
    public Label lbldate;
    public Label lbltime;
    public void initialize(){
        setdata();
    }

    private void setdata() {
                    Date date=new Date(); //utill
                    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                    String textdata=dateFormat.format(date);
                    lbldate.setText(textdata);
        /*lbldate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date())) ;
        //lbltime.setText(new SimpleDateFormat("HH-mm-ss ").format(new Date())) ;

        //================
        Timeline timeline=new Timeline(
                new KeyFrame(Duration.seconds(0)),
                e->     {
                    DateTimeFormatter dateTimeFormatter=
                            DateTimeFormatter.ofPattern("hh:mm:ss");
                    lbltime.setText(LocalTime.now().format(dateTimeFormatter));


                }

        ),*/

        //=================
    }


    public void logoutonaction(ActionEvent actionEvent) {

    }

    public void openstudenformonaction(ActionEvent actionEvent) throws IOException {
        setui("StudentForm");

    }

    private void setui(String location) throws IOException {
            Stage stage =(Stage) context.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
            stage.centerOnScreen();


        }
    }

