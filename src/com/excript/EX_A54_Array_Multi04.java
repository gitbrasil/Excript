/**
 * Aula 54 - Arrays Multidimensionais
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A54_Array_Multi04 {

    public static void main(String[] args) {

        int[][] nums = new int[2][9];
        nums[0][7] = 5;

        for (int i = 0; i < nums[0].length; i++) {
            System.out.println(nums[0][i]);
        }
    }

}
