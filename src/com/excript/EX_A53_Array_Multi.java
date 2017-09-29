/**
 * Aula 53 - Arrays Multidimensionais
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript;

public class EX_A53_Array_Multi {

    public static void main(String[] args) {

        int [] [] tabela = new int [5] [5];
        tabela [0][4] = 78;
        tabela [1][3] = 15;
        tabela [2][2] = 66;
        tabela [3][1] = 0;
        tabela [4][0] = -89;
        
        System.out.println(tabela [4][0]);
    }

}
