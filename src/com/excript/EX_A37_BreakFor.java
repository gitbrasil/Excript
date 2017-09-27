/**
 * Aula 38 - Instrucao Break com For
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A37_BreakFor {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\nA instrucao foi interrompida (break) quando a condicao foi atendida.\n");
        System.out.println("for (int i = 0; i < 10; i++) {");
        System.out.println("\tif (i == 5)");
        System.out.println("\t\tbreak;");
        System.out.println("\tSystem.out.println(i);\n");
    }

}
