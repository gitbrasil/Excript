/**
 * Aula 21 - Fluxos  Condicionais - While 02
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A21_While {

    public static void main(String[] args) {

        byte count = 3;

        System.out.println("Contador antes da mensagem:\n");
        System.out.println("byte count = 3;");
        System.out.println("while (count >= 0) {");
        System.out.println("count--;");
        System.out.println("System.out.println(count);\n");

        while (count >= 0) {
            count--;
            System.out.println(count);
        }

        System.out.println("\n\nContador depois da mensagem:\n");
        System.out.println("byte count = 3;");
        System.out.println("while (count >= 0) {");
        System.out.println("System.out.println(count);");
        System.out.println("count--;\n");

        count = 3;
        while (count >= 0) {
            System.out.println(count);
            count--;
        }

        System.out.println("\nObserve que o segundo fluxo while, a contagem regressiva ficou consistente (3 a 0).");
        System.out.println("\nO byte utiliza 8 bits e caso haja um erro de looping. -127/128 contagens ");
    }
}
