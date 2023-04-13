package edu.java.collections.set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
//  Crie uma conjunto contendo as cores do arco-íris e:
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

//  a) Exiba todas as cores o arco-íris uma abaixo da outra;
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
//  b) A quantidade de cores que o arco-íris tem;
        System.out.println("Quantidade de cores: " + arcoIris.size());

//  c) Exiba as cores em ordem alfabética;
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        for (String cor : arcoIris1) {
            System.out.println(cor);
        }

//  d) Exiba as cores na ordem inversa da que foi informada;
        List<String> arcoIris2 = new ArrayList<>(arcoIris1);
        Collections.reverse(arcoIris2);
        System.out.println(arcoIris2);

//  e) Exiba todas as cores que começam com a letra ”v”;
        for (String cor : arcoIris1) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

//  f) Remova todas as cores que não começam com a letra “v”;
        Iterator<String> iterator = arcoIris1.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (!cor.startsWith("v")) iterator.remove();
        }
        System.out.println(arcoIris1);

//  g) Limpe o conjunto;
        arcoIris1.clear();

//  h) Confira se o conjunto está vazio;
        System.out.println(arcoIris1.isEmpty());
    }
}
