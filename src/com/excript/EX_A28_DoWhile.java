/**
 * Aula 28 - do while - Calculadora
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A28_DoWhile {

    public static void main(String[] args) {

        /*
	 * double num1, num2, result; 
	 * 
	 * num1 = num2 = result = 0;
	 * 
	 * 
	 * Scanner leitor = new Scanner(System.in);
	 * 
	 * 
	 * System.out.println("1. Somar");
	 * 
	 * System.out.println("2. Subtrair");
	 * 
	 * System.out.println("3. Multiplicar");
	 * 
	 * System.out.println("4. Dividir");
	 * 
	 * System.out.println("0. Sair");
	 * 
	 * System.out.print("\nEscolha o num.: ");
	 * 
	 * i = leitor.nextByte();
	 * 
	 * 
	 * 
	 * if (i != 0) {
	 * 
	 * System.out.print("\nDigite o 1o num.: ");
	 * 
	 * num1 = leitor.nextDouble();
	 * 
	 * System.out.print("Digite o 2o num.: ");
	 * 
	 * num2 = leitor.nextDouble();
	 * 
	 * if (i == 1) {
	 * 
	 * result = num1 + num2;
	 * 
	 * } else if (i == 2) {
	 * 
	 * result = num1 - num2;
	 * 
	 * } else if (i == 3) {
	 * 
	 * result = num1 * num2;
	 * 
	 * } else if (i == 4) {
	 * 
	 * result = num1 / num2;
	 * 
	 * }
	 * 
	 * System.out.println("\nResultado : " + result);
	 * 
	 * }
	 *
	 *
	 * 
         */
        byte i = 0;
        double num1, num2, result;

        num1 = num2 = result = 0;

        Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("\nEscolha o num.: ");
            i = leitor.nextByte();

            if (i == 0) {
                System.out.println("Fim do programa!");
            } else {
                System.out.print("\nDigite o 1o num.: ");
                num1 = leitor.nextDouble();
                System.out.print("Digite o 2o num.: ");
                num2 = leitor.nextDouble();

                if (i == 1) {
                    result = num1 + num2;
                } else if (i == 2) {
                    result = num1 - num2;
                } else if (i == 3) {
                    result = num1 * num2;
                } else if (i == 4) {
                    result = num1 / num2;
                }
                System.out.println("\nResultado : " + result);
            }
        } while (i != 0);

        leitor.close();
    }

}
