package org.blindmaiden.example.security;


import org.blindmaiden.example.repository.UserList;
import org.blindmaiden.example.models.ResponseValidate;
import org.blindmaiden.example.models.ResponseValidator;
import org.blindmaiden.example.models.User;

import java.util.Optional;

public class PasswordValidator extends UserList {


    public ResponseValidate validate(User user) {

        ResponseValidator responseValidator = loginUser(user);
        if(responseValidator.getFlagSession() >= 3)
            return new ResponseValidate("Usted ha intentado entrar muchas veces, intente mas tarde.",false);

       if(!user.getUsername().equals(responseValidator.getUsername()))
           return new ResponseValidate("Las credenciales son invalidas",false);

       if(!user.getPassword().equals(responseValidator.getPassword())){
           user.setFlagSession(user.getFlagSession()+1);
           return new ResponseValidate("Las credenciales son invalidas",false);
       }
        user.setFlagSession(0);
        return new ResponseValidate("OK",true);
    }

    private ResponseValidator loginUser(User username) {
        Optional<User> response = lista.stream()
                .filter(user -> user.getUsername().equals(username.getUsername()))
                .findFirst();
        return response.map(user -> new ResponseValidator(user.getUsername(), user.getPassword(), user.getFlagSession())).orElseGet(() -> new ResponseValidator("", "",0));
    }

}
