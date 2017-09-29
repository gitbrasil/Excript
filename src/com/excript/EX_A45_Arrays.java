/**
 * Aula 45 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A45_Arrays {

    public static void main(String[] args) {

        int[] array;            // declarar array
        array = new int[10];    // reservar espaco

        for (int i = 0; i < 10; i++) {
            System.out.printf("{%5d} %7d\n", i, array[i]);
        }
    }

}
