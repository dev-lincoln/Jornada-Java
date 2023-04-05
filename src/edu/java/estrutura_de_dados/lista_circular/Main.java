package edu.java.estrutura_de_dados.lista_circular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("1");
        minhaListaCircular.add("2");
        minhaListaCircular.add("3");
        minhaListaCircular.add("4");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(1);

        System.out.println(minhaListaCircular);


        System.out.println(minhaListaCircular.get(2));

    }
}

