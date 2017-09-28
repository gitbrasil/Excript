/**
 * Aula 50 - Array
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Arrays;
import java.util.Scanner;

public class EX_A50_Array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[7];

        for (int i = 0; i < 7; i++) {

            System.out.printf("Digite o num. da posicao [%d] ", i + 1);
            valores[i] = in.nextInt();
        }
        System.out.println("Num.: " + Arrays.toString(valores));
    }

}
