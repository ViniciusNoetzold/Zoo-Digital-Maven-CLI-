package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;

public class TartarugaMarinha extends Reptil implements Nadador {

    public TartarugaMarinha(String nome, int idade, String corEscamas) {
        super(nome, idade, corEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está respirando fundo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas e águas-vivas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando graciosamente no oceano.");
    }
}