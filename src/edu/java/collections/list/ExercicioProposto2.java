package edu.java.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positivos = 0;
        List<String> perguntas = new ArrayList<String>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        System.out.println("Responda as perguntas com S para SIM e N para NÃO: ");

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scan.next();
            if (resposta.equalsIgnoreCase("s")){
                positivos++;
            }
        }

        switch (positivos) {
            case 0, 1 -> System.out.println("Essa pessoa é INOCENTE!");
            case 2 -> System.out.println("Essa pessoa é SUSPEITA!");
            case 3, 4 -> System.out.println("Essa pessoa é CÚMPLICE!");
            case 5 -> System.out.println("Essa pessoa é ASSASINA!");
            default -> System.out.println("Erro inesperado!");
        }





    }
}
