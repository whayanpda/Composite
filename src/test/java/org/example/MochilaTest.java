package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MochilaTest {

    @Test
    void deveRetornarNomeEPesoDaArma() {
        Arma espada = new Arma("Espada", 3.5);

        assertEquals("Espada", espada.getNome());
        assertEquals(3.5, espada.getPeso());
    }

    @Test
    void deveRetornarNomeEPesoDaPocao() {
        Pocao pocaoVida = new Pocao("Pocao de vida", 0.5);

        assertEquals("Pocao de vida", pocaoVida.getNome());
        assertEquals(0.5, pocaoVida.getPeso());
    }

    @Test
    void mochilaVaziaDeveRetornarApenasPesoProprio() {
        Mochila mochila = new Mochila("Mochila pequena", 1.2);

        assertEquals("Mochila pequena", mochila.getNome());
        assertEquals(1.2, mochila.getPeso());
    }

    @Test
    void mochilaDeveSomarPesoProprioComItensGuardados() {
        Mochila mochila = new Mochila("Mochila principal", 1.0);
        mochila.guardarItem(new Arma("Machado", 4.0));
        mochila.guardarItem(new Pocao("Pocao de mana", 0.7));

        assertEquals(5.7, mochila.getPeso(), 0.0001);
    }

    @Test
    void mochilaDeveSomarPesoDeMochilasAninhadas() {
        Mochila mochilaPrincipal = new Mochila("Mochila principal", 1.0);
        Mochila bolsaDePocoes = new Mochila("Bolsa de pocoes", 0.3);

        bolsaDePocoes.guardarItem(new Pocao("Pocao de vida", 0.5));
        bolsaDePocoes.guardarItem(new Pocao("Pocao de mana", 0.7));
        mochilaPrincipal.guardarItem(new Arma("Espada", 3.5));
        mochilaPrincipal.guardarItem(bolsaDePocoes);

        assertEquals(6.0, mochilaPrincipal.getPeso(), 0.0001);
    }
}
