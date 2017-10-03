/**
 * Aula 13 - Construtores
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj13;

// Construtor não permite retorno de valor de não tiver o mesmo nome da classe
class Janela {

    int largura, altura;

    public Janela(int l, int a) // construtor
    //  mesmo nome da Classe = diferencia os parenteses
    {
        largura = l;    //  atributos
        altura = a;     //  atributos   
    }

    void imprimir() // definir funcao
    {
        System.out.println("Altura = " + altura + ", a Largura = " + largura);
    }
}
