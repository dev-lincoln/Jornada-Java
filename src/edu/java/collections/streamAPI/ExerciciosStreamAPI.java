package edu.java.collections.streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosInteiros);


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> integers = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());

        integers.forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");

        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
        System.out.println("Remova os valores ímpares: ");
        numerosInteiros.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosInteiros);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);

        /*Set<Integer> numerosUnicos = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toSet());
        System.out.println(numerosUnicos.size());*/
        long count = numerosAleatorios.stream().distinct().count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + count);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        int sum = numerosAleatorios.stream().mapToInt(Integer::parseInt).filter(num -> (num % 2 == 0)).sum();
        System.out.println("Pegue apenas os números pares e some: " + sum);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<String> collect = numerosAleatorios.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect);


        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collect1 = numerosInteiros.stream().collect(Collectors.groupingBy(num -> (num % 3 == 0) || (num % 5 == 0)));
        System.out.println(collect1);

    }
}
