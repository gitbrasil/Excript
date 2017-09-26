/**
 * Aula 11 - Operadores de Comparacao em Java 02
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A11_OperComparacao {

    public static void main(String[] args) {

        boolean b = 1 == 1;

        int num1 = 0, num2 = 0;

        System.out.println("Comparar 1 == 1 : \t\t" + (1 == 1));
        System.out.println("b com atributo 1 == 1 : \t" + b);

        System.out.println("\n");

        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 > num2  : " + (num1 > num2));
        System.out.println("num1 < num2  : " + (num1 < num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));
        System.out.println("num1 != num2 : " + (num1 != num2));

    }

}
