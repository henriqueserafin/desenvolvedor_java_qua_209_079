package com.correcao4.app;
import com.correcao4.model.IMC;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        IMC imc = new IMC(0, 0);

        String[] opcoes = {"Calcular IMC", "Sair"};
        Object opcao;

        double imcValor;

        do {
            opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a opcção desejada",
            "IMC",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        if (opcao=="calcular IMC"){
            imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg: ").replace(",",".")));
            imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: ").replace(",",".")));

            imcValor=imc.calcularIMC();

            JOptionPane.showMessageDialog(null,
            "VAlor do IMC: "+String.format("%.2f", imcValor)+"\n"+imc.diagnostico(imcValor),
            "IMC resultado",
            JOptionPane.INFORMATION_MESSAGE);
        }
        } while (opcao!="Sair");
    }
}
