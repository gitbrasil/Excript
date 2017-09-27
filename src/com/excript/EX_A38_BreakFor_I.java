/**
 * Aula 38 - Break na Pratica
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A38_BreakFor_I {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Valor de i : " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Valor de i: " + i + " Valor de j: " + j);
            }
        }
        System.out.println("\nO Break (i == 3)");
    }
}
