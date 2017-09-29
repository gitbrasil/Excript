/**
 * Aula 57 - For Each
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A57_ForEach {

    public static void main(String[] args) {

        int[] nums = new int[10];
        nums[0] = 125;
        nums[1] = 5487;
        nums[2] = 45;
        nums[3] = 457;
        nums[4] = 887;
        nums[5] = 1;
        nums[6] = 4087;
        nums[7] = 1287;
        nums[8] = 5456;
        nums[9] = 789841;

        // media aritmetica
        int soma = 0;
        for (int item : nums) {
            soma += item;
            System.out.println(item);
        }
        float media = (float) soma / nums.length;
        System.out.println("Media aritmetica: " + media);

        // menor valor da lista
        int menor = 0;
        for (int item : nums) {
            if (item < menor || menor == 0) {
                menor = item;
            }
        }
        System.out.println("Menor valor da Lista: " + menor);

        // maior valor da lista
        int maior = 0;
        for (int item : nums) {
            if (item > maior || maior == 0) {
                maior = item;
            }
        }
        System.out.println("Maior valor da Lista: " + maior);

    }
}
