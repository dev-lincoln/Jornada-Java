package edu.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class ExercicioProposto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        int contador = 0;

        while (true) {
            if (contador == 6) break;
            System.out.println("Informe a temperatura: ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            contador++;
        }

        System.out.println("*................................................................*");

        Iterator<Double> iterator = temperaturas.iterator();
        double soma = 0d;
        double mediaTemperatura;

        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }

        mediaTemperatura = (soma/temperaturas.size());

        System.out.println("Temperaturas: " + temperaturas);
        System.out.println("Média Semestral das Temperaturas: " + mediaTemperatura);

        for (double temp : temperaturas){
            if(temp > mediaTemperatura){
                int index = temperaturas.indexOf(temp);
                switch(index){
                    case 0:
                        System.out.println((index + 1) + " - " + "JANEIRO " + temp + " oc");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - " + "FEVEREIRO " + temp + " oc");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - " + "MARÇO " + temp + " oc");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - " + "ABRIL " + temp + " oc");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - " + "MAIO " + temp + " oc");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - " + "JUNHO " + temp + " oc");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}