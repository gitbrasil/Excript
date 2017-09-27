/**
 * Aula 20 - Fluxos  Condicionais - While
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A20_While {

    public static void main(String[] args) {

        byte count = 0;

        // controlar fluxo
        System.out.println("Contador antes da mensagem:\n");
        System.out.println("while (count <= 2) {");
        System.out.println("count++;");
        System.out.println("System.out.println(count);\n");

        while (count <= 2) {
            count++;
            System.out.println(count);
        }

        System.out.println("\n\nContador depois da mensagem:\n");
        System.out.println("while (count <= 2) {");
        System.out.println("System.out.println(count);");
        System.out.println("count++;\n");

        count = 0;
        while (count <= 2) {
            System.out.println(count);
            count++;
        }

    }

}
