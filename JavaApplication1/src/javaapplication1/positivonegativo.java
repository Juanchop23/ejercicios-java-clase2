/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Sala403-3
 */
public class positivonegativo {

    public static void main(String arg[]) {
        //Solicitando información
        Scanner scanner = new Scanner(System.in);

        //Solicitando información
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero <= 0) {
            System.out.print("El número es 0");
        } else if (numero > 0) {
            System.out.print("El número es positivo");
        } else if (numero < 0){
            System.out.print("El número es negativo");
        }
    }
}
