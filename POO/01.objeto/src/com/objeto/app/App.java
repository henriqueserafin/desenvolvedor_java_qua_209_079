package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //instanciar a classe pessoa
    Pessoa usuario = new Pessoa();
    //segundo metodo
    // Pessoa usuario = new Pessoa("",0,0.0);
    Scanner leia = new Scanner(System.in);

        //define os valores dos atributos
        System.out.println("Informe o nome: ");
        usuario.nome=leia.nextLine();
        System.out.println("Informe o idade: ");
        usuario.idade=leia.nextInt();
        System.out.println("Informe o altura: ");
        usuario.altura=leia.nextDouble();


        // output
        System.out.println(usuario.comprimentar());
        usuario.exibirDados();
        


        leia.close();
    }
}
