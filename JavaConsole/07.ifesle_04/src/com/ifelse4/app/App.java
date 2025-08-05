package com.ifelse4.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //nova instancia do Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        String nome;
        int idade;

        //input
        System.out.print("Insira seu nome: ");
        nome = leia.nextLine();
        System.out.print("Inira sua idade: ");
        idade = leia.nextInt();

        // ternário
        System.out.println(nome + ((idade >= 18) ? " é maior de idade" : " é menor de idade"));


        leia.close();
    }
}
