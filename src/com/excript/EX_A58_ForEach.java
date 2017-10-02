/**
 * Aula 58 - For Each
 * out 02, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A58_ForEach {

    public static void main(String[] args) {
        //
        // array bidimensional 
        int[][] valores = new int[5][5];
        //
        // eixo x - linhas
        for (int x = 0; x < 5; x++) {
            // 
            // declarar variavel - dentro do 1o for
            String str = "";
            //
            // eixo y - colunas
            for (int y = 0; y < 5; y++) {
                //   
                // atribuir valor
                valores[x][y] = 2;
                //
                // exibir valores e ';' para melhor visualizar
                if (y < 4) {
                    str += valores[x][y] + "; ";
                } else {
                    str += "";
                }
            }
            System.out.println(str);
        }
    }

}
