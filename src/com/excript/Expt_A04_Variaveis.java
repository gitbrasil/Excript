/**
 * Aula 04 - Variaveis em Java
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A04_Variaveis {

    public static void main(String[] args) {

        byte valorByteMin = -128;
        byte valorByteMax = 127;

        short valorShortMin = -32768;
        short valorShortMax = 32767;

        int valorIntMin = -2147483648;
        int valorIntMax = 2147483647;

        System.out.println("Tamanho da Variaveis:");
        System.out.println("byte: 8 bits. \t\tExemplo: " + valorByteMin + " a " + valorByteMax);
        System.out.println("short: 16 bits. \tExemplo: " + valorShortMin + " a " + valorShortMax);
        System.out.println("int: 32 bits. \t\tExemplo: " + valorIntMin + " a " + valorIntMax);
        System.out.println("float: 32 bits \t\tExemplo: " + 25.5f);

        byte num = 0;
        String s = "111 ou AAA";

        System.out.println("\nVariavel: ");
        System.out.println("Byte = " + num);
        System.out.println("String = " + s);

        System.out.println("Carregar apenas o que for usar");
    }

}
