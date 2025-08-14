package com.regras.app;

import java.util.Scanner;

import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, "1234-5", "12345-6", 0);
        Scanner sc =  new Scanner(System.in);
        int opcao=0;
        double valor=0;

        System.out.print("Informe o nome do usuário: ");
        cc.setTitular(sc.nextLine());
        System.out.print("Informe o CPF: ");
        cc.setCpf(sc.nextLine());

        System.out.println("------------Banco------------\nSelecione uma opção");

        do {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Fazer saque");
            System.out.println("3 - fazer deposito");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo da conta: R$: "+cc.getSaldo());
                    break;
                case 2:
                    System.out.println("informe o valor do saque: ");
                    valor = sc.nextDouble();
                    cc.fazerSaque(valor);
                    System.out.println("novo saldo: R$"+cc.getSaldo());
                    break;
                case 3:
                    System.out.println("informe o valor do depósito: ");
                    valor = sc.nextDouble();
                    cc.fazerDeposito(valor);
                    System.out.println("novo saldo: R$"+cc.getSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao!=4);

        // System.out.println("Saldo da conta: R$: "+cc.getSaldo());

        


        sc.close();
    }
}
