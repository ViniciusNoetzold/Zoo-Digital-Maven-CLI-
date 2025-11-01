package br.edu.atitus.vinicius_de_almeida_noetzold.loc.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.animais.*;
import br.edu.atitus.vinicius_de_almeida_noetzold.zoo_digital.comportamento.*;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Bem-vindo ao Zoo Digital Maven CLI ---");
        
        boolean executando = true;
        while (executando) {
            exibirMenu();
            int opcao = getInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarTodosAnimais(); 
                    break;
                case 3:
                    listarCorredores(); 
                    break;
                case 4:
                    listarNadadores(); 
                    break;
                case 5:
                    listarVoadores(); 
                    break;
                case 6:
                    listarPredadores(); 
                    break;
                case 7:
                    exibirTotalAnimais(); 
                    break;
                case 0:
                    System.out.println("Obrigado por visitar o Zoo Digital. Até logo!");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            if (executando) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
    }

    private static void cadastrarAnimal() {
        System.out.println("--- Cadastro de Animal ---");
        System.out.println("Qual grupo de animal deseja cadastrar?");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Peixe");
        System.out.println("4. Réptil");
        System.out.println("0. Voltar ao menu");

        int grupo = getInt("Escolha o grupo: ");
        
        Animal novoAnimal = null;

        switch (grupo) {
            case 1:
                novoAnimal = cadastrarMamifero();
                break;
            case 2:
                novoAnimal = cadastrarAve();
                break;
            case 3:
                novoAnimal = cadastrarPeixe();
                break;
            case 4:
                novoAnimal = cadastrarReptil();
                break;
            case 0:
                return;
            default:
                System.out.println("Grupo inválido.");
                return;
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal); 
            System.out.println("\n>>> " + novoAnimal.getNome() + " (" + novoAnimal.getEspecie() + ") foi cadastrado com sucesso! <<<");
        }
    }

    private static Animal cadastrarMamifero() {
        System.out.println("--- Cadastro de Mamífero ---");
        System.out.println("1. Cachorro");
        System.out.println("2. Golfinho");
        System.out.println("3. Leão");
        System.out.println("4. Morcego");
        System.out.println("0. Voltar");
        
        int tipo = getInt("Escolha o mamífero: ");
        if (tipo == 0) return null;
        String nome = getString("Nome: ");
        int idade = getInt("Idade: ");

        switch (tipo) {
            case 1: return new Cachorro(nome, idade, getString("Raça: "));
            case 2: return new Golfinho(nome, idade);
            case 3: return new Leao(nome, idade);
            case 4: return new Morcego(nome, idade);
            default: System.out.println("Tipo inválido."); return null;
        }
    }

    private static Animal cadastrarAve() {
        System.out.println("--- Cadastro de Ave ---");
        System.out.println("1. Pato");
        System.out.println("2. Pinguim");
        System.out.println("3. Águia");
        System.out.println("4. Avestruz");
        System.out.println("0. Voltar");
        
        int tipo = getInt("Escolha a ave: ");
        if (tipo == 0) return null;
        String nome = getString("Nome: ");
        int idade = getInt("Idade: ");
        String corPenas = getString("Cor das Penas: ");
        
        switch (tipo) {
            case 1: return new Pato(nome, idade, corPenas);
            case 2: return new Pinguim(nome, idade, corPenas);
            case 3: return new Aguia(nome, idade, corPenas);
            case 4: return new Avestruz(nome, idade, corPenas);
            default: System.out.println("Tipo inválido."); return null;
        }
    }

    private static Animal cadastrarPeixe() {
        System.out.println("--- Cadastro de Peixe ---");
        System.out.println("1. Traíra");
        System.out.println("2. Peixe-Morcego");
        System.out.println("3. Tubarão");
        System.out.println("4. Peixe-Voador");
        System.out.println("0. Voltar");

        int tipo = getInt("Escolha o peixe: ");
        if (tipo == 0) return null;
        String nome = getString("Nome: ");
        int idade = getInt("Idade: ");

        switch (tipo) {
            case 1: return new Traira(nome, idade);
            case 2: return new PeixeMorcego(nome, idade);
            case 3: return new Tubarao(nome, idade);
            case 4: return new PeixeVoador(nome, idade);
            default: System.out.println("Tipo inválido."); return null;
        }
    }

    private static Animal cadastrarReptil() {
        System.out.println("--- Cadastro de Réptil ---");
        System.out.println("1. Jacaré");
        System.out.println("2. Tartaruga Marinha");
        System.out.println("3. Dragão de Komodo");
        System.out.println("4. Cobra");
        System.out.println("0. Voltar");
        
        int tipo = getInt("Escolha o réptil: ");
        if (tipo == 0) return null;
        String nome = getString("Nome: ");
        int idade = getInt("Idade: ");
        String corEscamas = getString("Cor das Escamas: ");
        
        switch (tipo) {
            case 1: return new Jacare(nome, idade, corEscamas);
            case 2: return new TartarugaMarinha(nome, idade, corEscamas);
            case 3: return new DragaoDeKomodo(nome, idade, corEscamas);
            case 4: return new Cobra(nome, idade, corEscamas);
            default: System.out.println("Tipo inválido."); return null;
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("--- Lista de Todos os Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        
        for (Animal animal : animais) {
            System.out.println("--------------------");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdade());
            
            System.out.print("Som: ");
            animal.emitirSom(); 
            System.out.print("Comida: ");
            animal.comer();
        }
    }

    private static void listarCorredores() {
        System.out.println("--- Animais Corredores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                System.out.println("--------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                
                Corredor corredor = (Corredor) animal; 
                System.out.print("Ação: ");
                corredor.correr();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal corredor encontrado.");
        }
    }

    private static void listarNadadores() {
        System.out.println("--- Animais Nadadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) { 
                System.out.println("--------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Nadador nadador = (Nadador) animal; 
                System.out.print("Ação: ");
                nadador.nadar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal nadador encontrado.");
        }
    }

    private static void listarVoadores() {
        System.out.println("--- Animais Voadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Voador) { 
                System.out.println("--------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Voador voador = (Voador) animal; 
                System.out.print("Ação: ");
                voador.voar(); 
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal voador encontrado.");
        }
    }

    private static void listarPredadores() {
        System.out.println("--- Animais Predadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                System.out.println("--------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Predador predador = (Predador) animal;
                System.out.print("Ação: ");
                predador.cacar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal predador encontrado.");
        }
    }

    private static void exibirTotalAnimais() {
        System.out.println("--- Total de Animais no Zoo ---");
        int total = Animal.getContador(); 
        System.out.println("O zoológico possui atualmente: " + total + " animais cadastrados.");
    }

      
    private static String getString(String prompt) {
        String texto;
        while (true) {
            System.out.print(prompt);
            texto = scanner.nextLine();
            if (texto != null && !texto.trim().isEmpty()) {
                return texto;
            }
            System.out.println("Erro: A entrada não pode ser vazia.");
        }
    }

    private static int getInt(String prompt) {
        while (true) {
            try {
                String linha = getString(prompt);
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
            }
        }
    }
}