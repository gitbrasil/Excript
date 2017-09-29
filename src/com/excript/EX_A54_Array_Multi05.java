/**
 * Aula 54 - Arrays Multidimensionais
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A54_Array_Multi05 {

    public static void main(String[] args) {

        int[][] nums = new int[2][9];
        
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;
        nums[0][3] = 40;
        nums[0][4] = 50;
        nums[0][5] = 60;
        nums[0][6] = 70;
        nums[0][7] = 80;
        nums[0][8] = 90;

        for (int i = 0; i < nums[0].length; i++) {
            System.out.println(nums[0][i]);
        }
    }

}
