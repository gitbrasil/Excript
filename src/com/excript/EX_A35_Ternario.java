/**
 * Aula 35 - Condicao Ternaria
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A35_Ternario {

    public static void main(String[] args) {

        int a, b;
        String valor;

        a = 5;
        b = 5;

//	if (a == b)
//		valor = "verdadeiro";
//	else
//		valor = "falso";
        //
        // ternary operator
        valor = (a > b) ? "verdadeiro" : "falso";

        System.out.println(valor);
    }

}
