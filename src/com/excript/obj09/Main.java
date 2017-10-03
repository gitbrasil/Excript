/**
 * Aula 09 - Instancia
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript.obj09;

class               // java so pode ter uma classe publica por arquivo
        Retangulo   // nome da classe (inicia-se com letra maiscula)
{
    public int width, height;   // atributos publicos podem ser acessados
    
    //
    // metodo (funcao)
    public int areaTotal()
    {
        return width * height;
    }
    //
    // metodo (funcao)
    public boolean isQuadrado()
    {
        return width == height; // nao ha necessidade de utilizar if
    }
}

public class Main {

    public static void main(String[] args) {

        /*
         havera erro de excecao 
         caso nao seja instaciada 
        /*
        Retangulo r1;
        r1.isQuadrado();
        */
       
        /* a variavel nao foi inicializada para termos didaticos
        /*
        // Retangulo r1 = new Retangulo();
        */
        
        // no caso abaixo a instancia nao foi inicializada
        Retangulo r1 = null;
        if (r1 != null)
                r1.isQuadrado();    
        
        // atribuir valores
        r1.height = 3;
        r1.width = 3;
        // exibir metodo com os valores atribuidos
        System.out.println("" + r1.areaTotal());
        System.out.println("" + r1.isQuadrado());
    }

}
