package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Voador;

public class Morcego extends Mamifero implements Voador {

    public Morcego(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está usando ecolocalização (cliques).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo frutas.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando silenciosamente na noite.");
    }
}
