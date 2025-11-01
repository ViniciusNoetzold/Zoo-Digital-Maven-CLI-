package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Corredor;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class Jacare extends Reptil implements Nadador, Corredor, Predador {

    public Jacare(String nome, int idade, String corEscamas) {
        super(nome, idade, corEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som gutural.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma capivara.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente no pântano.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " deu um bote rápido fora d'água.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está esperando submerso por uma presa.");
    }
}