package org.example;

public class Coche {
    private int numeroPuertas;

    public Coche(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }

    public void incrementarNumPuertas(){
        numeroPuertas++;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
