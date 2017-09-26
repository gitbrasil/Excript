/**
 * Aula 38 - Break na Pratica
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A38_BreakFor_I_J {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("Valor de i: " + i + " Valor de j: " + j);
                if (j == 3 && i == 0) {
                    break;
                }
            }
        }
        System.out.println("\nO Break (i == 3) e (j == 3 && i == 0)");
    }
}
