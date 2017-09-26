/**
 * Aula 31 - Looping For
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */

package com.excript;

public class Expt_A31_ForWhile {

	public static void main(String[] args) {

		System.out.println("\nLooping com o for \tLooping com o while");
		System.out.println("byte x = 0; 		byte y = 0;\t// inicializar");
		System.out.println("for (;x<=3;) {\t	while (y<=3) {\t// condicionar");
		System.out.println("++x;			++y		// atualizar\n");

		byte x = 0;         // inicializar
		for (; x <= 3;) {   // condicionar
			++x;        // atualizar
			System.out.println(x);
		}

	}

}
