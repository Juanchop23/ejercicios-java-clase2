/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Sala403-3
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        float a, b, c;

        //Randomizador
        Random rnd = new Random();

        a = (rnd.nextFloat() * 10);
        b = (rnd.nextFloat() * 10);
        c = (rnd.nextFloat() * 10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
