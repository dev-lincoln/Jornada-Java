package edu.java.estrutura_de_dados.implementacoes_java.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Honda"));

        System.out.println(stackCarros);

        stackCarros.pop();

        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());

        System.out.println(stackCarros.empty());

    }
}
