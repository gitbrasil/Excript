/**
 * Aula 34 - Valores Boolean Aleatorios
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Random;

public class Expt_A34_RandomBoolean {

    public static void main(String[] args) {

        Random num = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(num.nextBoolean());
        }

    }

}
