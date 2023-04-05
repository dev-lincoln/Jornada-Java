package edu.java.metodos.exercicio;

public class Mensagem {

    public static void obterMensagem(int hora){
        if((hora >= 12) && (hora <=18)) {
            System.out.println("Boa tarde!");
        } else if((hora > 18) && (hora <= 24)){
            System.out.println("Boa noite!");
        } else if((hora > 0) && (hora < 12)) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Hora ínválida!");
        }
    }
}
