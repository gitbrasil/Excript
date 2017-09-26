/**
 * Aula 16 - Constantes II
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Expt_A16_Constantes {

    public static void main(String[] args) {

        int tempo = 0;

        final double vsom = 340.28; // m/s

        Scanner leitor = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Informe o tempo decorrido: ");
        tempo = leitor.nextInt();

        System.out.println("A dist�ncia seria de " + Math.round((tempo * vsom)) + "m/s");
        System.out.println("ou em quilometros de " + decimal.format((tempo * vsom) / 1000) + "km/s");

        leitor.close();
    }

}
