package com.quatropilares.app;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);

        //input do user
        System.out.println("------------informe os dados do usuário------------\n");
        System.out.print("informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.print("informe o CPF: ");
        usuario.setCpf(sc.nextLine());
        System.out.print("informe a data de nascimento: ");
        usuario.setDataNascimento(sc.nextLine());
        System.out.print("informe o email: ");
        usuario.setEmail(sc.nextLine());
        System.out.print("informe o telefone: ");
        usuario.setTelefone(sc.nextLine());
        System.out.print("informe o endereço: ");
        usuario.setEndereco(sc.nextLine());

        //input da empresa
        System.out.println("------------informe os dados da empresa------------\n");
        System.out.print("informe a razão social da empresa: ");
        empresa.setRazaoSocial(sc.nextLine());
        System.out.print("informe o nome fantasia da empresa: ");
        empresa.setNomeFantasia(sc.nextLine());
        System.out.print("informe o CNPJ da empresa: ");
        empresa.setCnpj(sc.nextLine());
        System.out.print("informe o email da empresa: ");
        empresa.setEmail(sc.nextLine());
        System.out.print("informe o telefone da empresa: ");
        empresa.setTelefone(sc.nextLine());
        System.out.print("informe o endereço da empresa: ");
        empresa.setEndereco(sc.nextLine());

        //output do usuário
        System.out.println("------------informações do usuário------------");
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("CPF: "+usuario.getCpf());
        System.out.println("Data de Nascimento: "+usuario.getDataNascimento());
        System.out.println("Email: "+usuario.getEmail());
        System.out.println("Telefone: "+usuario.getTelefone());
        System.out.println("Endereço: "+usuario.getEndereco());

        //output da empresa
        System.out.println("------------informações da empresa------------");
        System.out.println("razão social: "+empresa.getRazaoSocial());
        System.out.println("Nome da empresa: "+empresa.getNomeFantasia());
        System.out.println("CNPJ: "+empresa.getCnpj());
        System.out.println("email da empresa: "+empresa.getEmail());
        System.out.println("Telefone da empresa: "+empresa.getTelefone());
        System.out.println("Endereço da empresa: "+empresa.getEndereco());


        sc.close();
    }
}