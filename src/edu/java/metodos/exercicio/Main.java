package edu.java.metodos.exercicio;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.somar(10, 8);
        Calculadora.subtrair(10, 8);
        Calculadora.multiplicar(10, 8);
        Calculadora.dividir(10, 8);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(19);
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(4);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
