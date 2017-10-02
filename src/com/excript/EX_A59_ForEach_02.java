/**
 * Aula 59 - Função Matricial
 * out 02, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A59_ForEach_02 {

    public static void main(String[] args) {
        //
        // Arrays bidimensionais (tabela 10 x 10)
        //
        int[][] valores = new int[10][10];
        //
        for (int x = 0; x < 10; x++) {
            String str = "";

            for (int y = 0; y < 10; y++) {
                valores[x][y] = ((x * 1) + (y * 2));
                //
                if (y < 9) {
                    str += valores[x][y] + ", ";
                } else {
                    str += valores[x][y];
                }
            }
            System.out.println(str);
        }

    }

}
