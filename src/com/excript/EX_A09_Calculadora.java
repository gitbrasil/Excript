/**
 * Aula 09 - Calculadora Simples
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A09_Calculadora {

    public static void main(String[] args) {

        double num1 = 0, num2 = 0, soma = 0, subtra = 0, multi = 0, divi = 0, resto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o 1o num.: ");
        num1 = leitor.nextDouble();

        System.out.print("Informe o 2o num.: ");
        num2 = leitor.nextDouble();

        soma = num1 + num2;
        subtra = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        resto = num1 % num2;

        // exibir resultados
        System.out.println("\nResultados: ");
        System.out.println("Somar: \t\t" + soma);
        System.out.println("Subtrair: \t" + subtra);
        System.out.println("Multiplicar: \t" + multi);
        System.out.println("Dividir: \t" + divi);
        System.out.println("Resto: \t\t" + resto);

        // close resource
        leitor.close();

    }

}
