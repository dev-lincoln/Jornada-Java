package edu.java.orientacao_a_objetos.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("SUV", 20, "vermelho");
        carro1.setCapacidadeTanque(10);


        System.out.println(carro1.calcularValor(4.50));
    }
}
