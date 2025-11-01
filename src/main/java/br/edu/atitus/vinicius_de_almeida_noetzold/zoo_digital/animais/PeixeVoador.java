package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Nadador;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.Voador;

public class PeixeVoador extends Peixe implements Nadador, Voador {

 public PeixeVoador(String nome, int idade) {
     super(nome, idade, "Salgada");
 }

 @Override
 public void emitirSom() {
     System.out.println(getNome() + " está borbulhando.");
 }

 @Override
 public void comer() {
     System.out.println(getNome() + " está comendo plâncton.");
 }

 @Override
 public void nadar() {
     System.out.println(getNome() + " está nadando rapidamente.");
 }

 @Override
 public void voar() {
     System.out.println(getNome() + " saltou da água e está planando!");
 }
}