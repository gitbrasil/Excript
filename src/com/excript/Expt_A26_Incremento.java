/**
 * Aula 26 - Operadores de Incremento
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A26_Incremento {

    public static void main(String[] args) {

        byte i;

        i = 0;
        System.out.println("Pre'-incremento ++i : " + ++i);
        System.out.println("Valor incrementado antes");

        i = 0;
        System.out.println("\nPo's-incremento i++ : " + i++);
        System.out.println("Valor incrementado apo's");

        int x;
        x = 0;
        System.out.println("\n\n3 formas de incremento/decremento");
        System.out.println("x = x + 1 \t: " + (x = x + 1));

        x = 0;
        System.out.println("x += 1 \t\t: " + (x += 1));

        x = 0;
        System.out.println("++x  \t\t: " + (++x) + "\t incremento antes ");

        x = 0;
        System.out.println("x++  \t\t: " + (x++) + "\t incremento apo's");
    }

}
