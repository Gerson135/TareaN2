

package com.mycompany.tarean2;

import java.util.Scanner;

public class TareaN2 {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.print("Ingrese una operacion aritmetica: ");
        String entrada = usuario.nextLine();
        String[] split = entrada.split(" "); 

        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[2]);

        String operador = split[1];
        switch(operador){
            case "+" : System.out.print("El resultado es: ");
                System.out.println(a + b);
            break;
            case "-" : System.out.print("El resultado es: ");
                System.out.println(a - b);
            break;
            case "*" : System.out.print("El resultado es: ");
                System.out.println(a * b);
            break;
            case "/" : System.out.print("El resultado es: ");
                System.out.println(a / b);
            break;
            default : System.out.println("~~~~OPERACION INVALIDA~~~~");
            break;
        }
    }
}
