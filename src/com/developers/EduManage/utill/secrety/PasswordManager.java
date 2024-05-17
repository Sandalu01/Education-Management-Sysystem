package com.developers.EduManage.utill.secrety;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordManager {
    public String Encript(String rowpassword){
            return BCrypt.hashpw(rowpassword,BCrypt.gensalt(10));//compiler==>
    }
    public boolean checkPassword(String rowpassword, String hashpassword){
        return BCrypt.checkpw(rowpassword,hashpassword);
    }
}
