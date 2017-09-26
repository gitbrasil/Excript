/**
 * Aula 34 - Nums. Aleatorios
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Random;

public class Expt_A34_Random {

    public static void main(String[] args) {

        // instanciar classe
        Random num = new Random();

        // exibir resultado
        System.out.println(num.nextInt());
        System.out.println("O Random gera nums. negativos e positivos");

    }

}
