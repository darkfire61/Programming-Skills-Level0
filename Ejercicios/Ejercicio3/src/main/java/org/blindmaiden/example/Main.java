package org.blindmaiden.example;

/*
 * 3. Crear un sistema de matrícula universitaria con las siguientes características:
 * El sistema cuenta con un login con usuario y contraseña.
 * Al iniciar sesión, un menú muestra los programas disponibles: Informática, Medicina, Marketing y Artes.
 * El usuario debe ingresar su nombre, apellido y programa elegido.
 * Cada programa tiene sólo 5 espacios disponibles. El sistema almacenará los datos de cada usuario registrado, y si supera el límite, deberá mostrar un mensaje indicando que el programa no está disponible.
 * Si la información de inicio de sesión es incorrecta tres veces, el sistema debe bloquearse.
 * El usuario debe elegir un campus de tres ciudades: Londres, Manchester, Liverpool.
 * En Londres, hay 1 plaza por programa; en Manchester, hay 3 espacios por programa y en Liverpool, hay 1 espacio por programa.
 * Si el usuario selecciona un programa en un campus que no tiene cupos disponibles, el sistema deberá mostrar la opción de inscribirse en el programa en otro campus.
 * */

import org.blindmaiden.example.logicproduct.MainMenu;
import org.blindmaiden.example.models.ResponseValidate;
import org.blindmaiden.example.models.User;
import org.blindmaiden.example.security.PasswordValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        Boolean finished = true;
        String usuario = null;
        String password = null;
        Boolean validated = true;
        User user = new User();
        PasswordValidator passwordValidator = new PasswordValidator();
        MainMenu mainMenu = new MainMenu();
        do {
            System.out.print("Bienvenido al sistema universitario.\n");
            do {
                System.out.print("Por favor ingrese su usuario: \n");
                usuario = reader.readLine();
                do {
                    if (usuario.isEmpty() || usuario.isBlank()) {
                        System.out.print("El usuario no puede estar vacio. Por favor ingrese su usuario nuevamente: \n");
                        usuario = reader.readLine();
                        if (usuario.isEmpty() || usuario.isBlank())
                            validated = false;
                    }
                } while (!validated);

                System.out.print("Ahora, Por favor ingrese su contraseña: ");
                password = reader.readLine();
                do {
                    if (password.isEmpty() || password.isBlank()) {
                        System.out.print("La contraseña no puede estar vacio. Por favor ingrese su contraseña nuevamente: \n");
                        password = reader.readLine();
                        if (password.isEmpty() || password.isBlank())
                            validated = false;
                    }
                } while (!validated);

                user.setUsername(usuario);
                user.setPassword(password);
                //TODO: llamado a la funcion de validacion de la contraseña
                ResponseValidate response = passwordValidator.validate(user);

                if (!response.isStatus()) {
                    System.out.println(response.getMessage());
                    finished = false;
                }
            } while (!finished);

            //TODO: llamado a la funcion de menu
            finished = mainMenu.menu();
        } while (!finished);
    }


}