package org.lesson.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        Ciclabile provaCiclabile = new Ciclabile();

        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        provaCiclabile.addElemento(15);
        provaCiclabile.addElemento(21);
        provaCiclabile.addElemento(15);
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());
        System.out.println(provaCiclabile.getElementoSuccessivo());
        System.out.println(provaCiclabile.hasAncoraElementi());

    }

}
