/**
 * Aula 44 - Arrays
 * set 20, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A44_Arrays {

    public static void main(String[] args) {

        System.out.println("Estrutura recomendada (oficial)");
        System.out.println("<tipo>[] <nome>");
        System.out.println("\nEvitar Estrutura herdada do C/C++");
        System.out.println("<tipo> <nome> []");
        System.out.println("\n");

        int[] arrInt = new int[5];
        System.out.println("'int [] arrInt = new int[5];'");
        System.out.println("'int [] arrInt' = declaração da variavel");
        System.out.println("'new int[5]' = objeto do tipo array com 5 elementos");
        System.out.println("\n");
        //
        int[] array; // declarar do array
        array = new int[10]; // criar e reservar espaco para o array
        //
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5d%7d\n", i, array[i]);
        }
    }

}
