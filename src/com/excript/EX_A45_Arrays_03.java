/**
 * Aula 45 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A45_Arrays_03 {

    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        System.out.printf("%s%10s \n", " ________ ", " ________ ");
        System.out.printf("%s%10s \n", "| Indice ", "| Valores |");
        System.out.printf("%s%10s \n", "|--------", "|---------|");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%5d%4s%8d |\n", i, "|", array[i]);
        }
        
        System.out.printf("%s%10s \n", "|--------", "|---------|");
    }

}
