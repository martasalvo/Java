/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Ejemplo {

    /*
     @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader;
        
        
        int numInteger;
        short numShort;
        int numEnterGran;

        float nf;
        double nd;

        boolean logic;

        char c = 'A';
        String frase;

        numInteger = (int) Math.pow(2, 16);

        numEnterGran = 23 % 5;

        numShort = 2;

        nf = 3.4f;

        nd = 3.4;

        logic = true;
        logic = false;

        System.out.println(numInteger);

        if (numEnterGran < numInteger || numShort >= 8) {

            frase = "Hola, soc la teva primera frase";

            System.out.println("La frase es: " + frase);
        }
        
        reader = new Scanner(System.in);
        System.out.println("Escriu un enter: ");
        numInteger = reader.nextInt();
        
        numEnterGran = 3 + numInteger;
        
        System.out.println("El resultat de suma 3 + " + numInteger + " es " +  numEnterGran );        
    }

}
