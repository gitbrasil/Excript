/**
 * Aula 31 - Looping For
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */

package com.excript;

public class EX_A31_For {

    public static void main(String[] args) {

	System.out.println("\nLooping com o for");
	System.out.println("byte x = 0; 	// inicializar");
	System.out.println("for (;x<=3;) {	// condicionar");
	System.out.println("++x;		// atualizar\n");

	byte x = 0; // inicializa��o
	for (; x <= 3;) { // express�o
		++x; // atualiza��o
		System.out.println(x);
	}

}

}
