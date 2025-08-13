package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Pessoa
        Pessoa usuario = new Pessoa();
        Scanner sc =  new Scanner(System.in);
        //inputs
        System.out.print("informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.print("informe o idade: ");
        usuario.setIdade(sc.nextInt());

        //output
        System.out.println("olá "+usuario.getNome()+" sua idade é: "+usuario.getIdade());

        // usuario.nome = sc.nextLine(); essa linha está errada já que não pode acessar o atributo diretamente


        sc.close();
        
    }
}
