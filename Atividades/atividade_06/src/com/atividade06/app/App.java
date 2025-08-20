package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa propietario = new Pessoa(null,
        null,
        null,
        null,
        null,
        null);
        Veiculo veiculo = new Veiculo(null,
            null,
            null,
            null,
            null,
            propietario
        );

        // input do propietario
        propietario.setNome(JOptionPane.showInputDialog("Informe o nome do propietário do veiculo"));
        propietario.setCpf(JOptionPane.showInputDialog("Informe o CPF do propietário do veiculo"));
        propietario.setEmail(JOptionPane.showInputDialog("Informe o email do propietário do veiculo"));
        propietario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do propietário do veiculo"));
        propietario.setEndereco(JOptionPane.showInputDialog("Informe o endereco do propietário do veiculo"));
        propietario.setCnh(JOptionPane.showInputDialog("Informe a cnh do propietário do veiculo"));

        //input do veiculo
        
    }
}
