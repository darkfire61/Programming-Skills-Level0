package org.blindmaiden.example.repository;

import org.blindmaiden.example.models.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserList {

    public List<User> lista = null;
    public UserList() {
        lista = new LinkedList<User>();
        try {
            User user1 = new User();
            user1.setId(1);
            user1.setUsername("Juan");
            user1.setPassword("12345");


            User user2 = new User();
            user2.setId(2);
            user2.setUsername("Peter");
            user2.setPassword("12345");


            User user3 = new User();
            user3.setId(3);
            user3.setUsername("Maria");
            user3.setPassword("12345");


            lista.add(user1);
            lista.add(user2);
            lista.add(user3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Fallo en la aplicacion + " + e.getLocalizedMessage());
        }
    }


}
