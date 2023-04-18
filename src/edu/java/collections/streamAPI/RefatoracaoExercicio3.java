package edu.java.collections.streamAPI;



import java.util.*;
import java.util.function.Function;

public class RefatoracaoExercicio3 {
    public static void main(String[] args) {
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};

        System.out.println("--\tOrdem aleatória\t--");
        System.out.println(contatos);
        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> contatos2 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(contatos2);
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> contatos3 = new TreeMap<>(contatos2);
        System.out.println(contatos3);

        System.out.println("--\tOrdem número telefone\t--");
        /*Set<Map.Entry<Integer, Contato>> contatos4 = new TreeSet<>(new ComparatorNumero());
        contatos4.addAll(contatos3.entrySet());*/

//        Utilizando Classe Anônima:
        /*Set<Map.Entry<Integer, Contato>> contatos4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
            }
        });*/

//        Utilizando Interface Funcional:
        /*Set<Map.Entry<Integer, Contato>> contatos4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {

            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));*/

//        Utilizando Lambda:
        Set<Map.Entry<Integer, Contato>> contatos4 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        System.out.println(contatos4);

        System.out.println("--\tOrdem nome contato\t--");
//        Set<Map.Entry<Integer, Contato>> contatos5 = new TreeSet<>(new ComparatorNome2());
//        contatos5.addAll(contatos.entrySet());

//        Utilizando Classe Anônima:
        /*Set<Map.Entry<Integer, Contato>> contatos5 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
            }
        });*/

//        Utilizando Interface Funcional:
        /*Set<Map.Entry<Integer, Contato>> contatos5 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato> nome) {
                return nome.getValue().getNome();
            }
        }));*/

//        Utilizando Lambda:
        Set<Map.Entry<Integer, Contato>> contatos5 = new TreeSet<>(Comparator.comparing(nome -> nome.getValue().getNome()));
        System.out.println(contatos5);
    }
}
