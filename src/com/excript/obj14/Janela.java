/**
 * Aula 14 - Inicializacao de Objetos
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj14;

class Janela {

    int largura;
    int altura;
    boolean b;
    float f;
    double d;

    Janela() { // o Java traz o valor padrao, mas pode ser 'sujeira' na variavel
        System.out.println("int = " + largura);
        System.out.println("bool = " + b);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
    }

    void imprimir() {
        System.out.println("Altura = " + altura + " Largura = " + largura);
    }

}
