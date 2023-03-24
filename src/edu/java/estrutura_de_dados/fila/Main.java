package edu.java.estrutura_de_dados.fila;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> minhaFila = new Fila();

        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.toString());
    }
}
