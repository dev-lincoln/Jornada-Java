package edu.java.estrutura_de_dados.implementacoes_java.queue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));

        System.out.println(queueCarros);

        // Offer adiciona igual ao ADD, porém, retorna FALSE se não conseguir;
        System.out.println(queueCarros.offer(new Carro("Hyundai")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println();













        }
    }
