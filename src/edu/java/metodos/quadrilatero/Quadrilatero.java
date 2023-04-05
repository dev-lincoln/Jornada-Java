package edu.java.metodos.quadrilatero;

// Exercitando o conceito de sobrecarga de métodos
public class Quadrilatero {
    public static double calcularArea(double x){
        return Math.pow(x,2);
    }
    public static double calcularArea(double a, double b){
        return a * b;
    }
    public static double calcularArea(double baseMenor, double baseMaior, double altura){
        return ((baseMenor + baseMaior)*altura) / 2;

    }
}
