package com.input.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Intância do Objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String email;
        int idade;

        //input 
        System.out.println("Informe se nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();
        
        System.out.println("Informe seu email: ");
        email = leia.nextLine();

        //output
        System.out.println("nome: " + nome + ".");
        System.out.println("idade: " + idade + ".");
        System.out.println("email: " + email + ".");

        // fechar objeto
        leia.close();
        
    }
}
