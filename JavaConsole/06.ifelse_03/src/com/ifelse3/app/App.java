package com.ifelse3.app;
 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //declaração de variavel
        String nome;
        double nota;

        //input
        System.out.print("Informe o nome do aluno: ");
        nome = leia.nextLine();
        System.out.print("Informe a nota do aluno: ");
        nota = leia.nextDouble();
        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println(nome + " está aprovado.");
            }
            else if (nota >= 5) {
                System.out.println(nome + " está de recuperação.");
            }
            else {
                System.out.println(nome + " está reprovado");
            }
        
        }
        else System.out.println("nota iválida");


        leia.close();
    }
}
