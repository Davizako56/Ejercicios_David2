package org.example;
import java.util.Scanner;

public class Menu {

    static int contador = 0;
    public static void main(String[] args) {

        menu();
    }


    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        int num;
        String[] modo = {"Dígitos","Potencias","Del Revés","Binario","A binario","Orden alfabético","Mostrar suma"};
        String opcion;

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");

        for(int i = 1; i <= 7; i++) {
            System.out.println(i + " - " + modo[i - 1]);
        }

        num = entrada.nextInt();

        switch(num) {

            case 1:
                Ejr1();
                while(true) {
                    System.out.println("Elige una opción:");
                    System.out.println("   [M] - Volver al menú principal");
                    System.out.println("   [X] - Salir");
                    opcion = entrada.next();

                    switch(opcion.toUpperCase()) {

                        case "M":
                            System.out.flush();
                            menu();

                        case "X":
                            System.exit(0);
                    }

                    System.out.println("ERROR: El programa no admite otra letra");
                }
        }
    }

    public static void Ejr1() {
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.println("Inserte un número...");
        num = entrada.nextInt();

        if(num == 0) {
            System.out.println("La cantidad de dígitos es 0");
        }else{
            Division(num);
        }

    }

    public static void Division(int num) {

        if(num <= 0) {
            System.out.println("La cantidad de dígitos es " + contador);
        }else{
            num = num / 10;
            contador++;
            Division(num);
        }
    }

}