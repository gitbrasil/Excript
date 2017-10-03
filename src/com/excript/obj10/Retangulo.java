/**
 * Aula 10 - New
 * out 03, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */

package com.excript.obj10;


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


}
