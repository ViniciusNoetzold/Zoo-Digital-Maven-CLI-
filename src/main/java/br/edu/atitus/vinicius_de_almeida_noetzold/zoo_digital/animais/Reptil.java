package br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais;

public abstract class Reptil extends Animal {
 
 private String corEscamas;

 public Reptil(String nome, int idade, String corEscamas) {
     super(nome, "Réptil", idade);
     this.corEscamas = corEscamas;
 }

 public String getCorEscamas() {
     return corEscamas;
 }

 public void setCorEscamas(String corEscamas) {
     this.corEscamas = corEscamas;
 }
 
 public void tomarSol() {
     System.out.println(getNome() + " está tomando sol para regular a temperatura.");
 }
}