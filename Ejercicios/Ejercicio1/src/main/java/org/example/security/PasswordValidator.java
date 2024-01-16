package org.example.security;

import org.example.models.ResponseValidator;
import org.example.models.User;

public class PasswordValidator {
    public static String password = "1234";
    public static String username = "roberto";

    public static ResponseValidator validate(User user) {
        if(user.getFlagSession() >= 3)
            return new ResponseValidator("Usted ha intentado entrar muchas veces, intente mas tarde.",false);

       if(!user.getUsername().equals(username))
           return new ResponseValidator("Las credenciales son invalidas",false);

       if(!user.getPassword().equals(password)){
           user.setFlagSession(user.getFlagSession()+1);
           return new ResponseValidator("Las credenciales son invalidas",false);
       }
        user.setFlagSession(0);

        return new ResponseValidator("OK",true);
    }

}
