/**
 * Aula 36 - Operador Ternario
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A36_Ternario {

    public static void main(String[] args) {

        byte num = 0;
        String dia = "";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu dia da semana predileto? Digite 1 (Domingo) a 7 (Sabado)");
        num = leitor.nextByte();

        // ternary operator
        dia = (num == 1) ? "Domingo"
                : (num == 2) ? "Segunda-Feira"
                        : (num == 3) ? "Terca-Feira"
                                : (num == 4) ? "Quarta-Feira"
                                        : (num == 5) ? "Quinta-Feira"
                                                : (num == 6) ? "Sexta-Feira" : (num == 7) ? "Sabado" : "Dia invalido";

        // exibir dados
        System.out.println("O dia escolhido : " + dia);

        // close resource
        leitor.close();
    }

}
