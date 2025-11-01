package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Voador;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando (pio agudo).");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um coelho.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando alto nas montanhas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está mergulhando para caçar.");
    }
}