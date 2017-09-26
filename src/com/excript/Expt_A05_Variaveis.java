/**
 * Aula 05 - Variaveis em Java 02
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A05_Variaveis {

    public static void main(String[] args) {

        byte valorByte = 100;
        short valorShort = 10000;
        int inteiro = 1000000;
        float fracional = 1000.09f;

        boolean bool = true;

        String t = "Texto";
        char a = 'a';

        System.out.println("byte \t" + valorByte + "\t 8 bits"
                + "\nshort \t" + valorShort + "\t 16 bits"
                + "\nint \t" + inteiro + "\t 32 bits"
                + "\nfloat  \t" + fracional + "\t 32 bits"
                + "\nString\t" + t
                + "\nchar  \t" + a
                + "\nboolean\t" + bool);

        System.out.println("\nO valor em char deve estar entre aspas simples \' \'.");
    }

}
