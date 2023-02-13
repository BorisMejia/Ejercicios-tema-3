package org.example;

public class Main {
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static void resultado(String[] args) {
        int resultado = suma(5,32,3);
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        Coche miCoche= new Coche(1);

        System.out.println("Número de puertas antes de agregar puertas: " + miCoche.getNumeroPuertas());

        miCoche.incrementarNumPuertas();

        System.out.println("Número de puertas después de agregar puestas " + miCoche.getNumeroPuertas());

    }
}