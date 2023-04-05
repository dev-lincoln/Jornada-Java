package edu.java.orientacao_a_objetos.exercicios;

public class Carro extends Veiculo {
    public String modelo;
    public int capacidadeTanque;
    public String cor;

    public Carro() {
    }

    public Carro(String modelo, int capacidadeTanque, String cor) {
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularValor(double valorGasolina){
        return valorGasolina * capacidadeTanque;
    }

}
