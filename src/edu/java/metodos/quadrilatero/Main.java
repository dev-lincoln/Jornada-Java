package edu.java.metodos.quadrilatero;

public class Main {
    public static void main(String[] args) {

//        Calcular a área do quadrado
        double quadrado = Quadrilatero.calcularArea(10);
        System.out.println("A área do quadrado é: " + quadrado);
//        Calcular a área do retângulo
        double retangulo = Quadrilatero.calcularArea(10, 20);
        System.out.println("A área do quadrado é: " + retangulo);
//        Calcular a área do trapézio
        double trapezio = Quadrilatero.calcularArea(10, 20, 1.78);
        System.out.println("A área do quadrado é: " + trapezio);
    }
}
