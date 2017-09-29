/**
 * Aula 48 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A48_Arrays_02 {

    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 12;
        arrayInt[4] = 89;
        arrayInt[5] = 55;
        arrayInt[6] = 10;
        arrayInt[7] = 1;
        arrayInt[8] = 9;
        arrayInt[9] = 78;

        int soma = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            soma += arrayInt[i];
        }
        System.out.println("Soma de todos os elementos: " + soma);
    }

}
