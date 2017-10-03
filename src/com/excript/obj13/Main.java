/**
 * Aula 13 - Construtores
 * out 02, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript.obj13;

// Construtor não permite retorno de valor

class Janela {
    int largura, altura;
    public Janela(int l, int a) // construtor
                                //  mesmo nome da Classe = direncia os parenteses
    { 
        largura = l;    //  atributos
        altura = a;     //  atributos   
    }
    // definir funcao
    void imprimir()
    {
        System.out.println("Altura = " + altura + ", a Largura = " + largura );    
    }
}

public class Main {

    public static void main(String[] args) {

        Janela j = new Janela(250, 250);    //  instanciar variavel do tipo Janela
                                            // de nome j atribuido 
        j.imprimir();   //  
        
    }

}
