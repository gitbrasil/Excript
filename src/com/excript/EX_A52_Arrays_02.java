/**
 * Aula 52 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

import java.util.Scanner;

public class EX_A52_Arrays_02 {

    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 5;
        nums[3] = 6;
        nums[4] = 7;

        int media = 0;
        for (int i = 0; i < nums.length; i++) {
            media += nums[i];
        }
        float total = (float) media / nums.length; // o float atuara apenas aqui
        System.out.println("Media: " + total);

    }

}
