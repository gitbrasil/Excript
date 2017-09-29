/**
 * Aula 57 - For Each
 * set 29, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A57_ForEach_02 {

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

        // media, menor e maior
        int soma = 0;
        int menor = 0;
        int maior = 0;
        double media = 0;

        System.out.println("Itens da Lista");
        for (int item : nums) {
            // exibir lista
            System.out.println(item);
            // soma
            soma += item;
            // menor
            if (item < menor || menor == 0) {
                menor = item;
            }
            // maior
            if (item > maior) {
                maior = item;

            }
            media = (float) soma / nums.length;

        }
        System.out.println("Media aritmetica: " + media);

        System.out.println("Menor valor da Lista: " + menor);
        System.out.println("Maior valor da Lista: " + maior);
    }
}
