/**
 * Aula 33 - Blocos de Instrucoes II
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A33_BlocoInstrucao {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("Instrucaoo nula: 'while (i <= 10);'");
        System.out.println("O uso do ';' restringiu o escopo e nao permite que o programa leia as instrucoes do bloco seguinte. \nIsto gera um looping! ");
        while (i <= 10);
        {
            ++i;
        }
    }

}
