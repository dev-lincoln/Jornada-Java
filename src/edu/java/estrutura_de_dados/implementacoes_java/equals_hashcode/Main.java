package edu.java.estrutura_de_dados.implementacoes_java.equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Honda"));

        System.out.println(listaCarros.contains(new Carro("Honda")));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.hashCode());
        System.out.println(carro2.hashCode());

        System.out.println(carro1.equals(carro2));

    }
}
