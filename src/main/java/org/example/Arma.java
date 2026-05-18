package org.example;

class Arma implements Item {
    private String nome;
    private double peso;

    public Arma(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() { return this.nome; }
    public double getPeso() { return this.peso; }
}
