package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Corredor;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Predador;

public class DragaoDeKomodo extends Reptil implements Corredor, Predador, Nadador {

    public DragaoDeKomodo(String nome, int idade, String corEscamas) {
        super(nome, idade, corEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carcaça (é um carniceiro).");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás de uma presa.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " mordeu sua presa e está esperando o veneno agir.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando para outra ilha.");
    }
}