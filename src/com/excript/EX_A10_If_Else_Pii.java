/**
 * Aula 40 - For - If & Else
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A10_If_Else_Pii {

    public static void main(String[] args) {

        System.out.println("Brincadeira do 'pii' de 0 a 40:");
        for (int i = 0; i < 40; i++) {
            if (i % 4 != 0) {
                System.out.println(i);
            }
            if (i == 0) {
                System.out.println();
            } else if (i % 4 == 0) {
                System.out.println("Pii\n");
            }
        }

    }

}
