/**
 * Aula 10 - If & Else 01
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class Expt_A10_If_Else {

    public static void main(String[] args) {

        int num1 = 0;
        String resultado = "";

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informar um num.: ");
        num1 = leitor.nextInt();

        if (num1 == 1) {
            System.out.println("Num. igual a 1!");
        } else {
            System.out.println("Num. diferente de 1!");
        }

        System.out.println("\nresultado = (num1 == 1) ? \"Num. igual a 1\" : \"Num. diferente de 1!\"");
        resultado = (num1 == 1) ? "Num. igual a 1" : "Num. diferente de 1!";
        System.out.println(resultado);

        leitor.close();
    }

}
