/**
 * Aula 46 - Array
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A46_Array {

    public static void main(String[] args) {

        int[] array = {78, 20, 56, 89, 0, 1};
        //
        System.out.printf("%s%8s \n", "Indice", "Valores");
        //
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d%9d\n", i, array[i]);
        }
    }

}
