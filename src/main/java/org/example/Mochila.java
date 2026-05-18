package org.example;

import java.util.ArrayList;
import java.util.List;

class Mochila implements Item {
    private String nome;
    private double pesoProprio;
    private List<Item> itensGuardados = new ArrayList<>();

    public Mochila(String nome, double pesoProprio) {
        this.nome = nome;
        this.pesoProprio = pesoProprio;
    }

    public void guardarItem(Item item) {
        this.itensGuardados.add(item);
    }

    public String getNome() { return this.nome; }


    public double getPeso() {
        double pesoTotal = this.pesoProprio;
        for (Item item : itensGuardados) {
            pesoTotal += item.getPeso();
        }
        return pesoTotal;
    }
}
