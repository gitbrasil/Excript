/**
 * Aula 24 - Precedencia de Operadores
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A24_Precedencia {

    public static void main(String[] args) {

        int a, b, x;

        a = 2;
        b = 3;
        x = 0;
        System.out.println("a = 2; b = 3;");

        System.out.println();
        x = a + b * a + b;
        System.out.println("x =  a + b  *  a + b \t: " + x);
        x = a + b * (a + b);
        System.out.println("x =  a + b  * (a + b) \t: " + x);
        x = (a + b) * (a + b);
        System.out.println("x = (a + b) * (a + b) \t: " + x);
        x = (a + b) * a + b;
        System.out.println("x = (a + b) *  a + b \t: " + x);

        System.out.println("\n\nPrecedencia de Operadores\n");
        System.out.println("1. ()");
        System.out.println("2. *, /, %");
        System.out.println("3. +, -");
        System.out.println("Operadores aplicados da direita para a esquerda");

    }

}
