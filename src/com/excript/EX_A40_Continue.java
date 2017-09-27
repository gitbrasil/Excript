/**
 * Aula 40 - Instrucao Continue
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A40_Continue {

    public static void main(String[] args) {

        System.out.println("Nums. pares de 0 a 100:");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
            System.out.println("Impar");
        }

    }

}
