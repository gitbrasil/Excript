/**
 * Aula 12 - Recursividade (metodo que chama a si mesmo)
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj12;

class Fatorial {
    
    int fat(int n) {
        if (n <= 1) // condicao basica
        {
            return 1;
        }
        int r = fat(n - 1) * n;
        return r;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(new Fatorial().fat(6));
    }
    
}
