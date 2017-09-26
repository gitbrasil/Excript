/**
 * Aula 25 - Operadores de Atribuicao
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A25_Atribuicao {

    public static void main(String[] args) {

        byte i = 0;

        i += 1;
        System.out.println("i += 1 : " + i);

        // i = i + 1;
        System.out.println(
                "\nOs tipos byte e short permitem atribuir, como: i += 1, \n\nNa~o permitem efetuar ca'lculos i = i + 1. ");

        System.out.println("\n\nPossi'veis: ");
        System.out.println("\nx += y");
        System.out.println("x -= y");
        System.out.println("\nx *= y");
        System.out.println("x /= y");
        System.out.println("\nx %= y");

        System.out.println("\n\n");
        int x = 12, y = 4;

        System.out.println("x = 12, y = 4");
        System.out.println("x += y : " + (x += y));
        x = 12;
        y = 4;
        System.out.println("x -= y : " + (x -= y));
        x = 12;
        y = 4;
        System.out.println("x *= y : " + (x *= y));
        x = 12;
        y = 4;
        System.out.println("x /= y : " + (x /= y));
        x = 12;
        y = 4;
        System.out.println("x %= y : " + (x %= y));

    }

}
