package com.atividade04.app;
import com.atividade04.model.ColetaDados;
import javax.swing.JOptionPane;



public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane.showMessageDialog(null,"Olá, Mundo!","titulo",JOptionPane.INFORMATION_MESSAGE);
        ColetaDados coleta = new ColetaDados(0, 0, 0, null);
        double imc;

        //input
        coleta.setNome(JOptionPane.showInputDialog("informe seu nome: "));
        coleta.setAltura(Double.parseDouble(JOptionPane.showInputDialog("informe sua altura: ")));
        coleta.setPeso(Double.parseDouble(JOptionPane.showInputDialog("informe seu peso: ")));
        imc = coleta.getPeso()/(coleta.getAltura()*coleta.getAltura());
        // peso/(altura*altura);
        JOptionPane.showMessageDialog(
        null,
        "nome: "+coleta.getNome()+"altura: "+coleta.getAltura()+"\npeso: "+coleta.getPeso()+"\nimc: "+imc,
        null,
        1);
        
    }
}
