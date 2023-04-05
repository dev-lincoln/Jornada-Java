package edu.java.estrutura_de_dados.implementacoes_java.list;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Honda"));
        listaCarros.add(new Carro("Chevrolet"));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.contains(new Carro("Hyundai2")));

        System.out.println(listaCarros.indexOf(new Carro("Hyundai")));



        }
    }
