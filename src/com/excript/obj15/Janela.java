/**
 * Aula 15 - This
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj15;

class Janela {

    int largura, altura;

    Janela(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    Janela() {  // ele invocara o outro contrutor
        this(100, 100);
        System.out.println("int = " + largura);
    }

    void imprimir() {
        System.out.println("Altura = " + altura + " Largura = " + largura);
    }
}
