/**
 * Aula 15 - Constantes
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A15_Constantes {

    public static void main(String[] args) {

        int varDeclaradaSemFinal = 0; // variavel
        final int varConstante = 0; // constante

        varDeclaradaSemFinal = 10;	// a variavel pode ser alterada
//		varConstante = 10;      // a constante nao pode ser alterada

        System.out.println("Variavel : " + varDeclaradaSemFinal);
        System.out.println("Constante: " + varConstante);

        /*
		 * Constantes
		 * 
		 * 1. os dados nunca sao alterados
		 * 
		 * 2. o endereco de memoria protegido
		 * 
		 * 3. nunca desalocada
		 * 
		 * 4. declaramos uma vez, utilizamos quantas vezes forem necess�ria
		 * 
		 * Exemplo de constante: Velocidade da luz.
         */
    }

}
