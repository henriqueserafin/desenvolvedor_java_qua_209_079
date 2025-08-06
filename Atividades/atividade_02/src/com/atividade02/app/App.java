package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;

        System.out.print("Informe seu nome: ");
        nome = leia.nextLine();

        System.out.print("Informe sua idade: ");
        idade = leia.nextInt();

        do {

            // lista de filmes
            System.out.println("\nEscolha um filme:");
            System.out.println("1 - Deadpool 2 (+16)");
            System.out.println("2 - Massacre da Serra Elétrica (+18)");
            System.out.println("3 - Xou da Xuxa (Livre)");
            System.out.println("4 - hora de aventura (+12)");
            System.out.println("5 - rei leão (+12)");
            System.out.println("6 - Sair");
            System.out.print("Selecione uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    if (idade >= 16) {
                        System.out.println(nome + "Ingresso liberado para Deadpool 2!");
                    } else {
                        System.out.println(nome +"Você não tem idade suficiente para esse filme.");
                    }
                    break;

                case 2:
                    if (idade >= 18) {
                        System.out.println(nome +"Ingresso liberado para Massacre da Serra Elétrica!");
                    } else {
                        System.out.println(nome +"Você não tem idade suficiente para esse filme.");
                    }
                    break;

                case 3:
                    System.out.println(nome +"Ingresso liberado para Xou da Xuxa!");
                    break;

                case 4:
                    System.out.println(nome +"Ingresso liberado para hora de aventura...");
                    break;
                case 5:
                    System.out.println(nome +"Ingresso liberado para rei leão...");
                    break;
                case 6:
                    System.out.println(nome +"Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 6);

        leia.close();
    }
}