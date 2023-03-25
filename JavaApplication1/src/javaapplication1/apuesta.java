/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sala403-3
 */
public class apuesta {

    /* En el juego de azar se lanzan 3 números. Si los 3 números son iguales gana el triple de lo apostado.
    Si al menos 2 son iguales, gana el doble; de lo contrario, intente de nuevo*/
    public static void main(String arg[]) {
        //Solicitando valor de la apuesta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de su apuesta: ");
        double apuesta = scanner.nextDouble();
        
        //Generando números aloeatorios
        //Instanciando la clase random
        Random rand = new Random();
        //Especificando el rango del primer número generado
        int rango1 = 25;
        // Generando números aleatorios usando nextInt()
        int random1 = rand.nextInt(rango1);

        //Especificando el rango del segundo número generado
        int rango2 = 25;
        // Generando números aleatorios usando nextInt()
        int random2 = rand.nextInt(rango2);

        //Especificando el rango del tercer número generado
        int rango3 = 25;
        // Generando números aleatorios usando nextInt()
        int random3 = rand.nextInt(rango3);

        // Imprimiendo valores
        System.out.println("Primer número: " + random1);
        System.out.println("Primer número: " + random2);
        System.out.println("Primer número: " + random3);
        
        //Condicionales gana o pierde
        if(random1 == random2 && random2 == random3){
            double triple = apuesta * 3;
            System.out.print("Usted ha ganado el triple de " + apuesta + ", total: " + triple);
        } else if (random1 == random2 || random1 == random2 || random1 == random3 || random2 == random3){
            double doble = apuesta * 2;
            System.out.print("Gana el doble. Felicitaciones. Total: " + doble);
        } else {
            System.out.print("Pierde jajajajaja maldito pobre lárguese del casino");
        }
    }
}
