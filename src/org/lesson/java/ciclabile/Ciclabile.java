package org.lesson.java.ciclabile;

public class Ciclabile {

    private int[] numeri = { 1, 2, 3, 4, 5 };
    private int richiesta = 0;

    // public Ciclabile(int[] numeri) {
    // this.numeri = numeri;
    // }

    public int getElementoSuccessivo() {
        for (int i = 0; i < numeri.length; i++) {

            if (i == this.richiesta) {
                this.richiesta = richiesta + 1;
                return this.numeri[i];
            }
        }
        return -1;
        // richiesta++;
        // return numeri[richiesta - 1];
    }

    public boolean hasAncoraElementi() {

        if ((richiesta + 1) <= this.numeri.length) {
            return true;
        } else {
            return false;
        }
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
