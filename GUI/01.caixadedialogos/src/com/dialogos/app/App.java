package com.dialogos.app;

import javax.swing.JOptionPane;
import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane.showMessageDialog(null,"Olá, Mundo!","titulo",JOptionPane.INFORMATION_MESSAGE);

        //instancia da classe pessoa
        Pessoa usuario = new Pessoa(null, 0);

        //caixa de input
        usuario.setNome(JOptionPane.showInputDialog("informe seu nome: "));
        usuario.setIdade(Integer.parseInt((JOptionPane.showInputDialog("informe sua idade"))));
        // JOptionPane.showInputDialog(null,usuario,null,0);

        //caixa de output
        JOptionPane.showMessageDialog(
            null,
            "Nome: "+usuario.getNome()+"\nIdade: "+usuario.getIdade(),
            "Saída",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
