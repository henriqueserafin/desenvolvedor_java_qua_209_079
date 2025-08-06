package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int opcao;
        double peso, altura, imc;

        do {
            // menu
            System.out.println("1 - Registrar nova pessoa");
            System.out.println("2 - Sair do programa");
            System.out.print("Informe a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); // limpa o buffer do teclado após nextInt()

            if (opcao == 1) {
                System.out.println("\nCalculadora de IMC");

                System.out.print("Informe seu nome: ");
                nome = leia.nextLine();

                System.out.print("Informe seu peso (kg): ");
                peso = leia.nextDouble();

                System.out.print("Informe sua altura (m): ");
                altura = leia.nextDouble();

                imc = peso / (altura * altura);
                System.out.printf("\n%s, seu IMC é: %.2f\n", nome, imc);

                // comparação do IMC
                if (imc < 18.5) {
                    System.out.println("Classificação: Magreza");
                } else if (imc < 25) {
                    System.out.println("Classificação: Normal");
                } else if (imc < 30) {
                    System.out.println("Classificação: Sobrepeso I");
                } else if (imc < 40) {
                    System.out.println("Classificação: Obesidade II");
                } else {
                    System.out.println("Classificação: Obesidade Grave III");
                }

                System.out.println(); // linha em branco
            }

        } while (opcao != 2);

        leia.close();
        System.out.println("Programa encerrado.");
    }
}