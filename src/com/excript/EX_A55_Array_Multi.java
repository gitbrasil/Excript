/**
 * Aula 55 - Arrays Multidimensionais
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A55_Array_Multi {

    public static void main(String[] args) {

        // 
        int[][] nums = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        //

        System.out.println("Linha");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(nums[x][y] + " ");
            }
        }
        System.out.println("\nColuna");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(nums[y][x] + " ");
            }
        }

    }
}
