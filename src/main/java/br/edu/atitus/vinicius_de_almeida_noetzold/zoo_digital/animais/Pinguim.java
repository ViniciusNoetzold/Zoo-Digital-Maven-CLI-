package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class Pinguim extends Ave implements Nadador, Predador{

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de peixes");
    }
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando Krill no gelo.");
    }
}
