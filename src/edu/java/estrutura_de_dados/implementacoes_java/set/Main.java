package edu.java.estrutura_de_dados.implementacoes_java.set;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        /*Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Hyundai"));
        hashSetCarros.add(new Carro("Honda"));
        hashSetCarros.add(new Carro("Chevrolet"));

        System.out.println(hashSetCarros);*/

        Set<Carro> treeSetCarros = new TreeSet<>();
//        Podemos mudar o compareTo da classe Carro para comparar por tamanho da string, ordem alfabética etc.

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Hyundai"));
        treeSetCarros.add(new Carro("Honda"));
        treeSetCarros.add(new Carro("Chevrolet"));

        System.out.println(treeSetCarros);







        }
    }
