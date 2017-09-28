/**
 * Aula 51 - Array
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A51_Array {

    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        //
        int[] valores = new int[7];
        //
        for (int i = 0; i < 7; i++) {
            //
            System.out.printf("Digite num.: da posicao [%d] : ", (i + 1));
            valores[i] = in.nextInt();
        }
        //
        int somaElementos = 0;
        //
        for (int x = 0; x < 7; x++) {
            somaElementos += valores[x];
        }
        System.out.printf("\nSoma dos elementos: %d\n", somaElementos);
        //
        for (int x = 0; x < 7; x++) {
            int produto = valores[x] * x;
        System.out.printf("Multi Indice x Elementos : %d * %d = %d\n", valores[x], x, produto);
        }
        //
        double soma = somaElementos;
        double media = soma / 7.0;
        System.out.printf("\nMedia aritmetica: %f\n", media);
        System.out.println("");
                System.exit(0);
    }

}
