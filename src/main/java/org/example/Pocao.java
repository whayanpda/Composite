package org.example;

class Pocao implements Item {
    private String nome;
    private double peso;

    public Pocao(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() { return this.nome; }
    public double getPeso() { return this.peso; }
}
