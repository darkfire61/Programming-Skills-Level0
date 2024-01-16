package org.example.logicproduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuService {


    public static String mainMenu() throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        Long money = 2000L;

        boolean responseResult = true;
        String finOperation = null;
        String finService = null;

        do {
            System.out.print("============ MENU DEL SISTEMA ==============\n");
            System.out.print("Depositar: Opcion 1\n");
            System.out.print("Retirar: Opcion 2\n");
            System.out.print("Consultar: Opcion 3\n");
            System.out.print("Transferir: Opcion 4\n");
            System.out.print("Salir: Opcion 5\n");
            System.out.print("Presione un numero para ingresar: ");
            Integer id = Integer.valueOf(reader.readLine());
            switch (id) {
                case 1:
                    System.out.print("====== Deposito ======\n");
                    System.out.print("Ingrese el monto a depositar: ");
                    Long depositMoney = Long.valueOf(reader.readLine());
                    System.out.print("Quiere realizar esta operacion: S/N\n");
                    finOperation = reader.readLine();
                    if (finOperation.equals("S")) {
                        if(money >= depositMoney)
                            money = money + depositMoney;
                        else
                            System.out.print("El monto ingresado es menor al saldo actual.");
                        System.out.print("Quiere realizar otra operacion: S/N\n");
                        finService = reader.readLine();
                        if (finService.equals("S")) {
                            responseResult = false;
                        }
                    } else {
                        responseResult = false;
                    }
                    break;
                case 2:
                    System.out.print("====== Retiro ======\n");
                    System.out.print("Ingrese el monto a retirar: ");
                    Long withdrawMoney = Long.valueOf(reader.readLine());
                    System.out.print("Quiere realizar esta operacion: S/N\n");
                    finOperation = reader.readLine();
                    if (finOperation.equals("S")) {
                        if(money >= withdrawMoney)
                            money = money + withdrawMoney;
                        else
                            System.out.print("El monto ingresado es menor al saldo actual.");
                        System.out.print("Quiere realizar otra operacion: S/N\n");
                        finService = reader.readLine();
                        if (finService.equals("S")) {
                            responseResult = false;
                        }
                    } else {
                        responseResult = false;
                    }
                    break;
                case 3:
                    System.out.print("====== Consulta de Saldo ======\n");
                    System.out.print("Su saldo es: " + money + "\n");

                    System.out.print("Quiere realizar otra operacion: S/N\n");
                    finService = reader.readLine();
                    if (finService.equals("S")) {
                        responseResult = false;
                    }
                    break;
                case 4:
                    System.out.print("====== Transferencia ======\n");
                    System.out.print("Ingrese el monto a transferir: ");
                    Long transferMoney = Long.valueOf(reader.readLine());
                    System.out.print("Ingrese el numero de cuenta a transferir: ");
                    String account = reader.readLine();
                    if(finOperation.equals("S")) {
                        if(money >= transferMoney)
                            money = money + transferMoney;
                        else
                            System.out.print("El monto ingresado es menor al saldo actual.");
                        System.out.print("Quiere realizar otra operacion: S/N\n");
                        finService = reader.readLine();
                        if (finService.equals("S")) {
                            responseResult = false;
                        }
                    }else{
                        responseResult = false;
                    }
                    break;
                case 5:
                    responseResult = true;
                    break;
                default:
                    break;
            }
        } while (!responseResult);

        return "Gracias por usar el sistema.";
    }


}
