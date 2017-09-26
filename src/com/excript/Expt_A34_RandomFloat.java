/**
 * Aula 34 - Nums. Aleatorios
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Random;

public class Expt_A34_RandomFloat {

    public static void main(String[] args) {

        Random num = new Random();

        System.out.println("Uso de Ponto Flutuante");
        for (int i = 0; i < 3; i++) {
            System.out.println(num.nextDouble());
        }
        System.out.println("Observe que o Random gerou apenas valores no ponto flutuante.\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(num.nextDouble() * 50);
        }
        System.out.println(
                "Agora o Random gerou um intervalo de 0 a 50 mais os valores do ponto flutuante.  'num.nextDouble()*50' .");

    }

}
