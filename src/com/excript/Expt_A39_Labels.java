/**
 * Aula 39 - Labels em Blocos de Instrucoes
 * 13 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A39_Labels {

    public static void main(String[] args) {

        label1:
        {
            labelIF:
            if (true) {
                System.out.println("Instrucao if");
                break labelIF;
            }
            System.out.println("label 1 ini");
            label2:
            {
                System.out.println("label 2 ini");
                label3:
                {
                    System.out.println("label 3 ini");
                    if (true) {
                        break label2;
                    }
                }
                System.out.println("label 2 fim");
            }
            System.out.println("label 1 fim");
        }

    }
}
