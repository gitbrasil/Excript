/**
 * Aula 45 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A45_Arrays_02 {

    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        System.out.printf("%s%10s \n", "Indice", "Valores");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("{%5d} %7d\n", i, array[i]);
        }
    }

}
