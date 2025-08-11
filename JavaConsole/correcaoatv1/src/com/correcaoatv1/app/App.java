package com.correcaoatv1.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia do Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome, opcao, diagnostico;
        double peso, altura, imc;
        int saida = 0;

        // loop
        do {
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Sair do programa");
            System.out.println("Escolha a opção:");
            opcao = leia.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Informe seu nome:");
                    nome = leia.nextLine();
                    System.out.println("Informe seu peso em kg:");
                    peso = leia.nextDouble();
                    System.out.println("Informe sua altura em metros:");
                    altura = leia.nextDouble();

                    imc = peso / (altura*altura);

                    System.out.println("O IMC de " + nome + " é " + String.format("%.2f", imc) + ".");

                    // ternário
                    diagnostico = (imc < 18.5) ? nome + " está abaixo do peso."
                    : (imc < 25) ? nome + " está no peso ideal."
                    : (imc < 30) ? nome + " está acima do peso."
                    : (imc < 35) ? nome + " está obeso."
                    : (imc < 40) ? nome + " está com obesidade nível II."
                    : nome + " está com obesidade mórbida.";
                    System.out.println(diagnostico);
                    break;
                case "2":
                    saida = Integer.parseInt(opcao);
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (saida != 2);

        // fecha objeto Scanner
        leia.close();
    }
}
