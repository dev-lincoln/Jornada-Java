package edu.java.collections.map;

import java.util.*;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, LivroFavorito> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen",  new LivroFavorito("Uma Breve Histéria do Tempo", 256));
            put("Duhigg, Charles", new LivroFavorito("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new LivroFavorito("21 Liçãs Para o Século 21", 432));
        }};

        System.out.println(meusLivros);

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, LivroFavorito> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen",  new LivroFavorito("Uma Breve Histéria do Tempo", 256));
            put("Duhigg, Charles", new LivroFavorito("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new LivroFavorito("21 Liçãs Para o Século 21", 432));
        }};

        System.out.println(meusLivros1);

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, LivroFavorito> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, LivroFavorito> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        };

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, LivroFavorito>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros2.entrySet());
        for (Map.Entry<String, LivroFavorito> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }



        System.out.println("--\tOrdem número de página\t--"); //Pra você
        Set<Map.Entry<String, LivroFavorito>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros3);
        for (Map.Entry<String, LivroFavorito> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPagina());
        }

    }
}

class LivroFavorito implements Comparable<LivroFavorito> {
    private String nome;
    private Integer pagina;

    public LivroFavorito(String nome, Integer pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPagina() {
        return pagina;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", pagina=" + pagina +
                '}';
    }

    @Override
    public int compareTo(LivroFavorito livro) {
        return this.nome.compareToIgnoreCase(livro.nome);
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, LivroFavorito>> {
    @Override
    public int compare(Map.Entry<String, LivroFavorito> l1, Map.Entry<String, LivroFavorito> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, LivroFavorito>>{

    @Override
    public int compare(Map.Entry<String, LivroFavorito> l1, Map.Entry<String, LivroFavorito> l2) {
        return Integer.compare(l1.getValue().getPagina(), l2.getValue().getPagina());
    }
}




