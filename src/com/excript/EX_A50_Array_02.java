/**
 * Aula 50 - Array
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Arrays;
import java.util.Scanner;

public class EX_A50_Array_02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[7];

        double soma = 0, media = 0, produto = 0;

        int i = 0;
        for (; i < 7; i++) {
            System.out.printf("Digite o num. da posicao [%d] ", i + 1);
            //
            valores[i] = in.nextInt();
            soma += valores[i];
            produto = (valores[i] * i);
        }

        media = soma / i;

        System.out.println("\nDigitados.: " + Arrays.toString(valores));
        System.out.println("\nSoma: " + soma);
        System.out.println("\nMultiplicacao: " + produto);
        System.out.println("Qtde: " + i);
        System.out.println("Media " + media);
    }

}
