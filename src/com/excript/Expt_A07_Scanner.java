/**
 * Aula 07 - Ler dados do teclado
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class Expt_A07_Scanner {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0, soma = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1o num.: ");
        num1 = leitor.nextInt();

        System.out.print("Digite o 2o num.: ");
        num2 = leitor.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos nums.: " + soma);

        leitor.close();
    }

}
