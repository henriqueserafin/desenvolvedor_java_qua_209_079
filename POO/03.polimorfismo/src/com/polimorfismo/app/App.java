package com.polimorfismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancias
        Scanner sc = new Scanner(System.in);
        // Pessoa pessoa = new Pessoa(null, null, null);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        //input do user
        System.out.println("DADOS DO USUÁRIO: ");
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF do usuário: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe a data de nascimento do usuário: ");
        usuario.dataNascimento = sc.nextLine();
        System.out.println("Informe o email do usuário: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone do usuário: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o endereço do usuário: ");
        usuario.endereco = sc.nextLine();

        //input da empresa
        System.out.println("DADOS DA EMPRESA: ");
        System.out.println("informe a razão social da empresa: ");
        empresa.razaoSocial = sc.nextLine();
        System.out.println("informe o nome da empresa: ");
        empresa.nomeFantasia = sc.nextLine();
        System.out.println("informe o cnpj: ");
        empresa.cnpj = sc.nextLine();
        System.out.println("informe o email da empresa: ");
        empresa.email = sc.nextLine();
        System.out.println("informe o telefone da empresa: ");
        empresa.telefone = sc.nextLine();
        System.out.println("informe o endereco da empresa: ");
        empresa.endereco = sc.nextLine();

        // executar os metodos dos objetos
        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());



        sc.close(); 
    }
}
