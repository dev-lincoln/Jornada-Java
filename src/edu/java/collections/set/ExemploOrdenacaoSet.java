package edu.java.collections.set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 20));
            add(new Serie("dark", "ficção", 72));
            add(new Serie("house", "drama", 43));
            add(new Serie("black mirror", "drama", 21));
        }};

        for (Serie serie : minhasSeries) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());
        }


        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("How to Get Away with Murder", "drama", 43));
        }};

        for (Serie serie : minhasSeries2) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");

        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);

        for (Serie serie : minhasSeries3) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");

        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroDuracao());

        minhasSeries4.addAll(minhasSeries);

        for (Serie serie : minhasSeries4) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());
        }
        System.out.println("--\tOrdem gênero\t--");

        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());

        minhasSeries5.addAll(minhasSeries);

        for (Serie serie : minhasSeries5) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());
        }
        System.out.println("--\tOrdem Tempo Episódio\t--");

        Set<Serie> minhasSeries6 = new TreeSet<>(minhasSeries);

        for (Serie serie : minhasSeries6) {
            System.out.println("Nome: " + serie.getNome() + " Gênero: " + serie.getGenero() + " Duração: " + serie.getDuracao());

        }
    }

}



class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getDuracao(), s2.getDuracao());
    }
}

class ComparatorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if(genero != 0) return genero;

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        return Integer.compare(s1.getDuracao(), s2.getDuracao());
    }
}

class ComparatorDuracao implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int duracao =  Integer.compare(s1.getDuracao(), s2.getDuracao());
        if(duracao != 0) return duracao;

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        return s1.getGenero().compareTo(s2.getGenero());
    }
}



