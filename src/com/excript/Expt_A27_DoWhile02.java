/**
 * Aula 27 - do & while
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A27_DoWhile02 {

    public static void main(String[] args) {

        byte i = 0;

        System.out.println("\nO fluxo 'while' na~o satisfaz o fluxo!");
        while (i != 0) {
            System.out.println("while");
        }
        System.out.println("\n\nO 'do' permite executar ao menos uma vez! ");
        do { // o bloco sera' executado ao uma vez
            System.out.println("\nA mensagem 'do / while' apareceu ao menos uma vez!");

        } while (i != 0);

    }

}
