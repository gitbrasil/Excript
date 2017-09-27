/**
 * Aula 12 - Depurar Programa
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A12_Depurar {

    public static void main(String[] args) {

        double num1, num2, num3, num4, resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Ingressar a 1a nota: ");
        num1 = leitor.nextDouble();
        System.out.print("Ingressar a 2a nota: ");
        num2 = leitor.nextDouble();
        System.out.print("Ingressar a 3a nota: ");
        num3 = leitor.nextDouble();
        System.out.print("Ingressar a 4a nota: ");
        num4 = leitor.nextDouble();

        resultado = (num1 + num2 + num3 + num4) / 4;

        System.out.println("Media: " + resultado);

        if (resultado >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // close resource
        leitor.close();
    }

}
