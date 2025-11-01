package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Corredor;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;

public class Cachorro extends Mamifero implements Nadador, Corredor{
 
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, true);
        this.raca = raca;
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua ração");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bolinha");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando estilo cachorrinho");
    }


    public String getRaca() {
        return raca;
    }
    
}
