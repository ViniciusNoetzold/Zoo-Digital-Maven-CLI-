package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Corredor;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade) {
        super(nome, idade, true); // temPelo = true
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo na savana.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando uma zebra.");
    }
}