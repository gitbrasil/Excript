/**
 * Aula 11 - Overloading - Sobrecarga de metodos
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.excript.obj11;

class Sobrecarga {

    void imprime(String s) {
        System.out.println(s);

    }

    void imprime(String s1, String s2) {        // pode definir o mesmo nome
        System.out.println(s1 + " - " + s2);    // desde o conjunto de parametros sejam diferentes
    }

    void imprime(String s1, int i1) {
        System.out.println(s1 + " : " + i1);
    }

}

public class Main {

    public static void main(String[] args) {

      new Sobrecarga().imprime("Um parametro do tipo String");
      new Sobrecarga().imprime("Primeiro parametro", "Segundo parametro");
      new Sobrecarga().imprime("A idade é de", 5);
    }

}
