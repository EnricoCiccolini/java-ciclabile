package org.lesson.java.ciclabile;

public class Ciclabile {

    private int[] numeri;
    private int richiesta = 0;

    public Ciclabile(int[] numeri) {
        this.numeri = numeri;
    }

    public Ciclabile() {
        this.numeri = new int[0];
    }

    public int getElementoSuccessivo() {
        // for (int i = 0; i < numeri.length; i++) {

        // if (i == this.richiesta) {
        // this.richiesta = richiesta + 1;
        // return this.numeri[i];
        // }
        // }
        // return -1;

        if (hasAncoraElementi()) {
            richiesta++;
            return numeri[richiesta - 1];
        }
        return -1;
    }

    public boolean hasAncoraElementi() {
        return ((richiesta + 1) <= this.numeri.length);
        // if ((richiesta + 1) <= this.numeri.length) {
        // return true;
        // } else {
        // return false;
        // }
    }

    public void addElemento(int nummeroDaAggiungere) {
        int[] numeriConAggiunta = new int[numeri.length + 1];
        for (int i = 0; i < numeri.length; i++) {
            numeriConAggiunta[i] = numeri[i];
        }
        numeriConAggiunta[numeriConAggiunta.length - 1] = nummeroDaAggiungere;

        numeri = numeriConAggiunta;

    }

}
