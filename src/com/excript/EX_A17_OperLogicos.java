/**
 * Aula 17 - Operadores Logicos
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A17_OperLogicos {

    public static void main(String[] args) {

        int idade = 0;

        final int idadeJovem = 17, idadeIdosa = 60;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        idade = leitor.nextInt();

        if (idade < 0 || idade > 120) {
            System.out.println("Verifique a idade!");
        } else if (idade <= idadeJovem) {
            System.out.println("Idade informada de um jovem");
        } else if (idade > idadeJovem && idade <= idadeIdosa) {
            System.out.println("A idade informada de um adulto");
        } else {
            System.out.println("Idade informada de uma pessoa idosa");

        }

        leitor.close();
    }

}
