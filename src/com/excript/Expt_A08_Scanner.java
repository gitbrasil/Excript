/**
 * Aula 08 - Entrada e Saida de Dados
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class Expt_A08_Scanner {

    public static void main(String[] args) {

        int idadeDoCachorro = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informar a idade do seu Cachorro: ");
        idadeDoCachorro = leitor.nextInt();

        idadeDoCachorro *= 7;

        System.out.println("A idade equivalente de um humano: " + idadeDoCachorro);

        leitor.close();

    }

}
