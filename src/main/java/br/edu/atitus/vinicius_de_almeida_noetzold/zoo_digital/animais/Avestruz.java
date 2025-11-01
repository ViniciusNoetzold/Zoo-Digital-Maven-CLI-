package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Corredor;

public class Avestruz extends Ave implements Corredor {

    public Avestruz(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som grave.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes e insetos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo muito rápido!");
    }
}