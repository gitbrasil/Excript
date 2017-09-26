/**
 * Aula 18 - Tipos Primitvos 01
 * 11 de set de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.excript;

public class Expt_A18_TiposPrimitivos {

    public static void main(String[] args) {

        char caracter = 'a';
        boolean verdade = true;
        byte numByte = 100;
        short numShort = 1000;
        int numInt = 10000;
        float numFloat = 100000.12f;
        double numDouble = 1000000.12345;
        long numLong = 10000000;

        System.out.println("Tipo \t\tTamanho(Byte) \t\tFaixa \t\t\t\t\tValor Declarado");
        System.out.println("\"char\" \t\t 2 Byte \t\t UNICODE \t\t\t\t" + caracter);
        System.out.println("\"boolean\" \t 1 Byte \t\t True/False \t\t\t\t" + verdade);
        System.out.println("\"byte\" \t\t 1 Byte \t\t +/- 128 (2^8 = 256) \t\t\t" + numByte);
        System.out.println("\"short\" \t 2 Byte \t\t +/- 32768 (2^16 = 65536) \t\t" + numShort);
        System.out.println("\"int\" \t\t 4 Byte \t\t +/- 2147483648 (2^32 = 4294967296) \t" + numInt);
        System.out.println("\"long\" \t\t 8 Byte \t\t +/- 9223372036854775808 \t\t" + numLong);
        System.out.println("\"float\" \t 4 Byte \t\t P.Flutuante +/-3.4E-38 \t\t" + numFloat);
        System.out.println("\"double\" \t 8 Byte \t\t P.Flutuante +/-1.7E-308 \t\t" + numDouble);

    }

}
