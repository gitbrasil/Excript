/**
 * Aula 22 - O problema de Loopings
 * 12 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A22_Loopings {

    public static void main(String[] args) {

        // byte x = 0; // 127 fluxos
        short x = 0; // 32768 fluxos

        while (x <= 10) {
            x--;
            System.out.println(x);
        }
        System.out.println("\nPara pequenos fluxos, utilizar os tipos byte ou short");
    }

}
