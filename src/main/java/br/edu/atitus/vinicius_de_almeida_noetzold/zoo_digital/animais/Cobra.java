package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class Cobra extends Reptil implements Predador, Nadador {

    public Cobra(String nome, int idade, String corEscamas) {
        super(nome, idade, corEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando (Tssss).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo um rato.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " deu o bote e está se enrolando na presa.");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando na beira do rio.");
    }
}