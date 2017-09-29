/**
 * Aula 48 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A48_Arrays {

    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;

        int soma = arrayInt[0] + arrayInt[1] + arrayInt[2];
        
        System.out.println("Soma do 3 primeiros elementos: " + soma);

    }

}
