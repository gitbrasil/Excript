/**
 * Aula 13 - Calculadora 2.0
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A13_Calculadora {

    public static void main(String[] args) {

        double num1 = 0, num2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 1 para Somar: ");
        System.out.println("Digite 2 para Subtrair: ");
        System.out.println("Digite 3 para Multiplicar: ");
        System.out.println("Digite 4 para Dividir: ");

        int option = leitor.nextInt();

        System.out.print("Digite o 1o num.: ");
        num1 = leitor.nextDouble();
        System.out.print("Digite o 2o num.: ");
        num2 = leitor.nextDouble();

        /*
	 * // comparar dados
	 * 
	 * if (option == 1) {
	 * 
	 * 		System.out.println("A soma � : " + (num1 + num2));
	 * 
	 * 		} else {
	 * 	
	 * 			if (option == 2) {
	 * 	
	 * 				System.out.println("A subtra��o � : " + (num1 - num2));
	 * 
	 * 			} else {
	 * 
	 * 				if (option == 3) {
	 * 
	 * 					System.out.println("A multipli��o � : " + (num1 * num2));
	 * 
	 * 				} else {
	 * 
	 * 					if (option == 4) {
	 * 
	 * 						System.out.println("A divis�o � : " + (num1 / num2)); 
	 * 
	 * 					} 
	 * 
	 *	 			}
	 * 
	 * 			} 
	 * 
	 * 		}
         */
        //
        // comparar dados - Clean Code
        if (option == 1) {
            System.out.println("Soma: " + (num1 + num2));
        } else if (option == 2) {
            System.out.println("Subtracao: " + (num1 - num2));
        } else if (option == 3) {
            System.out.println("Multiplicacao: " + (num1 * num2));
        } else if (option == 4) {
            System.out.println("Divisao: " + (num1 / num2));
        }

        leitor.close();
    }

}
