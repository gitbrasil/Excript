/**
 *
 * out 02, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript;

public class EX_A60_Array_Planilhas {

    public static void main(String[] args) {

        // double[][] plan = new int[5][6];
        double[][] plan
                = {
                    {434,       45,     912,    42,     54,     0},
                    {23.8,      973.3,  254.8,  744.2,  3.74,   0},
                    {23.8,      973.3,  254.1,  744.2,  3.74,   0},
                    {53.52,     67,     873,    245.9,  54.12,  0},
                    {234.25,    54.2,   82.0,   745.2,  82,     0}
                   };

        double somaTotal = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                plan[x][5] += plan[x][y];
            }
            somaTotal += plan[x][5];
        }
        
        
        
        for (int x = 0; x < 5; x++) {
            String str = "";
            for (int y = 0; y < 6; y++) {
                if (y < 5) {
                    str += plan[x][y] + ", ";
                } else {
                    str += plan[x][y];
            }
                System.out.println(str);
            
        }
                System.out.println("Soma total: " + somaTotal);
        
        
    }
}
}
