/**
 * Aula 08 - Retornando valores
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj08;

/*
// Este mesmo conteudo que esta na Classe Retangulo neste mesmo pacote
// ser feito aqui
//
class Retangulo {

    public int width;
    public int height;

    public int areaTotal() // metodo 'observe os parenteses'
    {
        return width * height;
    }

    public boolean isQuadrado() // metodo 'observe os parenteses'
    {
        return width == height; // nao ha necessidade de criar um if
        // o metodo lhe da o Clean Code neste caso
    }

 */
//
public class Main {

    public static void main(String[] args) {

        //
        // variavel do tipo Retangulo de nome quadrado; nova instancia de Quadrado
        Retangulo quadrado = new Retangulo();
        //
        // atribuindo valores aos atributos de Classe   
        quadrado.height = 2;
        quadrado.width = 3;
        //
        // executar metodo (funcao) da areaTotal da instancia da Classe quadrado 
        System.out.println("" + quadrado.areaTotal());
        // executar metodo (funcao) da isQuadrado
        System.out.println("" + quadrado.isQuadrado());
        //
        //
        // nova instancia 
        Retangulo quadrado2 = new Retangulo();
        // atribuir valores
        quadrado2.height = 2;
        quadrado2.width = 2;
        // exibir metodo
        System.out.println("" + quadrado2.areaTotal());
        System.out.println("" + quadrado2.isQuadrado());

    }

}
