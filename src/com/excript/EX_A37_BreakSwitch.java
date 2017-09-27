/**
 * Aula 38 - Instrucao Break com Switch
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A37_BreakSwitch {

    public static void main(String[] args) {

        byte dia = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu dia da semana predileto? Digite 1 (Domingo) a 7 (Sabado)");
        dia = leitor.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }

        leitor.close();
    }
}
