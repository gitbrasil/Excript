/**
 * Resto da Divisao
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A14_Resto {

    public static void main(String[] args) {

        double num1 = 0, num2 = 0, resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1o num.: ");
        num1 = leitor.nextDouble();
        System.out.print("Digite o 2o num.: ");
        num2 = leitor.nextDouble();

        resultado = num1 % num2;

        System.out.println("Resto da divisao: " + resultado);

        leitor.close();

        System.out.println("\nOutros resultados de resto de divisao, sem numeros informados: ");
        System.out.println("3 % 2\t: " + (3 % 2));
        System.out.println("4 % 2\t: " + (4 % 2));
        System.out.println("5 % 2\t: " + (5 % 2));
        System.out.println("6 % 2\t: " + (6 % 2));
        System.out.println("7 % 3.1\t: " + (7 % 3.1));
        System.out.println("8 % 3.1\t: " + (8 % 3.1));
    }

}
