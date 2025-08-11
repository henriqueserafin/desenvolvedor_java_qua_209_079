package com.correcaoatv2.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome, sala;
        int idade, idadeMinima = 0;

        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe a idade:");
        idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();

        do {
            // salas
            System.out.println("☕Cine Java☕\n");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 3 - As Tranças do Rei Careca - 14 anos");
            System.out.println("Sala 4 - Poeira em Alto Mar - 16 anos");
            System.out.println("Sala 5 - A Vingança do Frango Assado - 18 anos");
            System.out.println("Qual sala deseja entrar?");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                    break;
                case "2":
                    idadeMinima = 12;
                    break;
                case "3":
                    idadeMinima = 14;
                    break;
                case "4":
                    idadeMinima = 16;
                    break;
                case "5":
                    idadeMinima = 18;
                    break;
                default:
                    idadeMinima = idade + 1;
                    System.out.println("Sala inexistente.");
            }

            if (idade >= idadeMinima) {
                System.out.println("Entrada permitida para " + nome + ".");
                System.out.println("Tenha um bom filme! 🎞🎟");
            }
            else {
                System.out.println("Favor escolher outro filme!");
            }
        } while(idade < idadeMinima);

        leia.close();
    }
}
