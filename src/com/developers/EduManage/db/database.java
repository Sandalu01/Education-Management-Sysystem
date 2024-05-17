package com.developers.EduManage.db;
import com.developers.EduManage.model.Student;
import com .developers.EduManage.model.user;
import com.developers.EduManage.utill.secrety.PasswordManager;

import java.util.ArrayList;

public class database {
    public static ArrayList<user>usertable=new ArrayList();
    public static ArrayList<Student>studenttable=new ArrayList();

    static {
        usertable.add(new user("sandalu",
                "ekanayaka","sandalu",  new PasswordManager().
                Encript("1234")));
    }

}