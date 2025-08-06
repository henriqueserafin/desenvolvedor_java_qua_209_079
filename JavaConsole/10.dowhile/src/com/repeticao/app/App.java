package com.repeticao.app;
import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;
        double altura;



        do {
            // menu
            System.out.println("1 - Registrar nova entrada");
            System.out.println("2 - Sair do programa");
            System.out.print("informe a opção desejada: ");
            opcao = leia.nextInt();

            if (opcao==1) {
                leia.nextLine();
                System.out.print("informe sua nome: ");
                nome = leia.nextLine();
                System.out.print("informe sua idade: ");
                idade = leia.nextInt();
                System.out.print("informe sua altura: ");
                altura = leia.nextDouble();

                //verifica a idade e altura
                if (idade>=12 && altura>=1.15) {
                    System.out.println(nome + " está autorizado");
                }
                else System.out.println(nome+" não está autorizado");
            }
            else if (opcao != 2) {
                System.out.println("Opção iválida! ");
            }
        } while (opcao !=2);




        leia.close();
    }
}
