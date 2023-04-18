package edu.java.collections.map;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;

public class ExercicioProposto3 {
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
        Set<Map.Entry<Integer, Contato>> contatos4 = new TreeSet<>(new ComparatorNumero());
        contatos4.addAll(contatos3.entrySet());
        System.out.println(contatos4);

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> contatos5 = new TreeSet<>(new ComparatorNome2());
        contatos5.addAll(contatos.entrySet());
        System.out.println(contatos5);
    }

}

class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>> {


    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
    }
}

class ComparatorNome2 implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}



