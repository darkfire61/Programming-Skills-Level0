package org.example;

import org.example.logicproduct.MenuService;
import org.example.models.ResponseValidator;
import org.example.models.User;
import org.example.security.PasswordValidator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 1. Cree un sistema de banca en línea con las siguientes características:
 * Los usuarios deben poder iniciar sesión con un nombre de usuario y contraseña.
 * Si el usuario ingresa las credenciales incorrectas tres veces, el sistema debe bloquearlas.
 * El saldo inicial en la cuenta bancaria es de $2000.
 * El sistema debe permitir a los usuarios depositar, retirar, ver y transferir dinero.
 * El sistema debe mostrar un menú para que los usuarios realicen transacciones.
 * */


public class Main {

    public static void main(String[] args) throws Exception {

        Boolean finished = true;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String usuario = null;
        String password = null;
        Boolean validated = true;
        User user = new User();

        do{
            System.out.print("Bienvenido al sistema bancario.\n");
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
            ResponseValidator response = PasswordValidator.validate(user);

            if (!response.isStatus()) {
                System.out.println(response.getMessage());
                finished =false;
            }
        } while (!finished);

        String responseMenu =  MenuService.mainMenu();
        System.out.println(responseMenu);




    }


}

