/**
 * Aula 56 - For Each
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript;

public class EX_A56_ForEach {

    public static void main(String[] args) {

        int [] lista = new int[3];
        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 30;
        
        for (int item : lista) {
            System.out.println(item);
        }
    }

}
