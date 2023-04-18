package edu.java.collections.map;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        int qtdLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random dado = new Random();
        for (int i = 0; i < qtdLancamentos; i++){
            int number = dado.nextInt(6) + 1;
            valores.add(number);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if(lancamentos.containsKey(resultado)) {
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            } else {
                lancamentos.put(resultado, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()){
            System.out.println("Valor: " + entry.getKey() + " - " + "Quantidade: " + entry.getValue());
        }



    }
}
