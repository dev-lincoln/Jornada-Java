package edu.java.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int count = fatorial; count >= 1; count--) {
            multiplicacao = multiplicacao * count;
        }
        System.out.println(multiplicacao);
    }
}
