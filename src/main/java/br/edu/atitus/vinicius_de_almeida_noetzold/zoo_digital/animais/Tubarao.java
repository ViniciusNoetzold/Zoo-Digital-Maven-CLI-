package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada"); 
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não emite som, apenas nada ameaçadoramente.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outros peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está patrulhando o oceano.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " deu um bote e está caçando.");
    }
}