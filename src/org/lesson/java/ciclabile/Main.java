package org.lesson.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        Ciclabile provaCiclabile = new Ciclabile(new int[] { 1, 2, 34, 5, 6 });

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

        Ciclabile provaCiclabile2 = new Ciclabile();
        provaCiclabile2.addElemento(2);
        provaCiclabile2.addElemento(3);
        System.out.println(provaCiclabile2.getElementoSuccessivo());
        System.out.println(provaCiclabile2.hasAncoraElementi());
        System.out.println(provaCiclabile2.getElementoSuccessivo());
        System.out.println(provaCiclabile2.hasAncoraElementi());

    }

}
