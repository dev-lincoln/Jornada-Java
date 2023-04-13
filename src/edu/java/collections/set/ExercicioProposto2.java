package edu.java.collections.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioProposto2 {
    public static void main(String[] args) {
//    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        Set<LinguagemFavorita> linguagens = new HashSet<>() {{
            add(new LinguagemFavorita("java", 1991, "intellij"));
            add(new LinguagemFavorita("go", 2009, "goland"));
            add(new LinguagemFavorita("php", 1995, "phpstorm"));
        }};
        System.out.println(linguagens);

//    a) Ordem de inserção;
        Set<LinguagemFavorita> linguagens2 = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("java", 1991, "intellij"));
            add(new LinguagemFavorita("go", 2009, "goland"));
            add(new LinguagemFavorita("php", 1995, "phpstorm"));
        }};
        System.out.println(linguagens2);

//    b) Ordem natural(nome);
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens2);
        System.out.println(linguagens3);

//    c) IDE;
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIde());
        linguagens4.addAll(linguagens3);
        System.out.println(linguagens4);
//    d) Ano de criação e nome;
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorAnoNome());
        linguagens5.addAll(linguagens);
        System.out.println(linguagens5);

//    e) Nome, ano de criação e IDE;
        Set<LinguagemFavorita> linguagens6 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens6.addAll(linguagens);
        System.out.println(linguagens6);

//    Ao final, exiba as linguagens no console, um abaixo da outra.
        for (LinguagemFavorita linguagem : linguagens){
            System.out.println(linguagem);
        }

    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
