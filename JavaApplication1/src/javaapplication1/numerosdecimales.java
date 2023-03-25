/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Sala403-3
 */
public class numerosdecimales {

    public static void main(String[] args) {

        float a;

        Random rnd = new Random();

        a = (rnd.nextFloat() * 10);

        System.out.println("Valor con decimales: " + a);

        //Formato con cantidad de decimales
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Con dos decimales: " + df.format(a));

    }
}
