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
public class numeromayor {

    /* Capturar dos números e imprimir el mayor de ellos*/
    public static void main(String arg[]) {
        //Solicitando número 1
        Scanner scanner = new Scanner(System.in);

        //Solicitando número 1
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        //Solicitando número2
        Scanner scanner2 = new Scanner(System.in);
        //Solicitando número 2
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner2.nextDouble();

        //Condición
        if(numero1 > numero2){
            System.out.print("El número " + numero1 + " es mayor");
        } else if(numero2 > numero1){
            System.out.print("El número " + numero2 + " es mayor");
        } else if(numero1 == numero2){
            System.out.print("Los números son iguales");
        }
    }
    
    /* En el juego de azar se lanzan 3 números. Si los 3 números son iguales gana el triple de lo apostado.
    Si al menos 2 son iguales, gana el doble; de lo contrario, intente de nuevo*/
}
