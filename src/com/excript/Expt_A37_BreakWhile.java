/**
 * Aula 38 - Instrucao Break com While
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */

package com.excript;

public class Expt_A37_BreakWhile {

public static void main(String[] args) {

		// flow control
		int i = 0;
		while (i < 10) {
			if (i == 5)
				break;
			i++;
			System.out.println(i);
		}
		System.out.println("\nA instrucao foi interrompida (break) quando a condicao foi atendida.\n");
		System.out.println("int i = 0;");
		System.out.println("\twhile (i < 10) {");
		System.out.println("\t\tif (i == 5)");
		System.out.println("\t\t\tbreak;");
		System.out.println("\t\ti++;");
		System.out.println("\tSystem.out.println(i);");
	}

}
