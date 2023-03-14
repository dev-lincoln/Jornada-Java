package edu.lincoln.java.loops_e_arrays;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int countPar = 0, countImpar = 0;

        System.out.println("Quantos números você deseja?: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
            if (numero%2 == 0) countPar++;
            else countImpar++;
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + countPar);
        System.out.println("Quantidade de números ímpares: " + countImpar);

    }
}
