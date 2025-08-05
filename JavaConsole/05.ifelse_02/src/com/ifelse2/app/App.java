package com.ifelse2.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Intância do Objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;
        double altura;
        //input
        System.out.print("qual seu nome? ");
        nome = leia.nextLine();
        System.out.println("qual sua idade? ");
        idade = leia.nextInt();
        // leia.nextDouble();
        System.out.println("informe sua altura");
        altura = leia.nextDouble();

        //estrutura de decisão

        if (idade >=12 && altura >= 1.15) {
            System.out.println(nome+" está autorizado");
            
        } else {
            System.out.println(nome+" não está autorizado");
            
        }






        leia.close();
        
    }
}

