/**
 * Aula 10 - New
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript.obj10;

public class Main {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(); // variavel r1 recebe nova instancia de Retangulo
        Retangulo r2;   // variavel do tipo Retangulo
        
        r2 = r1;    // r2 vai receber o mesmo local da memoria que r1 aponta
                    // r2 vai refletir r1 e r2 vai refletir r1
        
        r1.width = 100;
        r2.height = 200;
        
        System.out.println("r1 : " + r1.width);
        System.out.println("r2 : " + r2.width);
        
        System.out.println("r1 : " + r1.height);
        System.out.println("r2 : " + r2.height);
        
        // com tipos sao atribuidos o valor
        // nao apontam para o objeto
        
        int i1 = 10; // um local na memoria
        int i2 = i1; // outro local na memoria
        i2 = 20;
        System.out.println("i1 : " + i1);
        System.out.println("i2 : " + i2);
        
    }

}
