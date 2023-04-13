package edu.java.collections.set;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer duracao;

    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(duracao, serie.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getDuracao(), serie.getDuracao());
    }
}
