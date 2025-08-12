package com.atividade03.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do titular:");
        String nome = sc.nextLine();

        System.out.println("Informe o CPF do titular:");
        String cpf = sc.nextLine();

        System.out.println("Informe a agência:");
        String agencia = sc.nextLine();

        System.out.println("Informe o número da conta:");
        String numeroConta = sc.nextLine();

        Conta conta = new Conta(nome, cpf, agencia, numeroConta, 0.0);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer saque");
            System.out.println("3 - Fazer depósito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:
                    System.out.print("Valor do saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Valor do depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}


//TODO - 
// Crie um programa com uma classe chamada **Conta**, com os seguintes atributos:

// - Titular da conta
// - CPF do titular
// - Agência
// - Número da conta
// - Saldo

// O usuário deverá informar o nome do titular e o CPF, e o programa exibe um menu com as seguintes operações:

// - Exibir dados da conta
// - Fazer saque
// - Fazer depósito
// - Sair do programa