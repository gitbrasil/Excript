/**
 * Aula 05 - Atributos
 * out 02, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj05;

public class Main {

    public static void main(String[] args) {

        Mobile mobile;          // variavel de nome mobile do tipo da Classe Mobile
        mobile = new Mobile();  // a variavel mobile deve receber uma nova Instancia de Mobile

        Mobile mobile2 = new Mobile();  // outra forma de instaciar a variavel

        mobile.volume = 5;  // o modificador do volume foi defido como publico, 
                            // acesso total

//        mobile.ligado = true;   // o modificador definido com privado, 
                                  // não temos acesso, apenas se houver um 
                                  // método que manipule a variável da Classe

        //
        System.out.println("Qual é o volume: " + mobile.volume);
    }

}
