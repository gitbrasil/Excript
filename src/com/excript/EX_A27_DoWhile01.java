/**
 * Aula 27 - do & while
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A27_DoWhile01 {

    public static void main(String[] args) {

        byte i = 0;

        do { // o bloco ser� executado no m�nimo uma vez
            System.out.println(i);
            ++i;
        } while (i <= 10);

    }

}
