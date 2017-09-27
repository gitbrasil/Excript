/**
 * Aula 34 - Nums. Aleatorios
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Random;

public class EX_A34_RandomDados {

    public static void main(String[] args) {

        Random num = new Random();

        System.out.println("\nNum. de um dado: " + (num.nextInt(6)));
        System.out.println("Random gera o valor 'zero'.");

        System.out.println("\nNums. de um dado: 1 a 6 : " + (num.nextInt(6) + 1));
        System.out.println("Somado o 1, pois o Random gera o valor 'zero'. 'num.nextInt(6)+1'\n");

    }

}
