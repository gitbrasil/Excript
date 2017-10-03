/**
 * Aula 07 - Parametros e Argumentos
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript.obj07;


class Calculo 
{
    void soma (int num1, int num2) // parametros do tipo inteiro com dois argumentos
    {
        System.out.println(num1 + num2);
    }
}


public class Main // todo arquivo Java so pode ter uma class publica
{

    public static void main(String[] args) {

        Calculo                 // variavel do tipo Calculo
                cal             // de nome cal
                = new           // nova
                    Calculo();  // instancia Calculo
        //
        // invocacao do metodo (funcao)
        // a funcao soma esta contida na classe
        cal.soma(5, 25);
    }

}
