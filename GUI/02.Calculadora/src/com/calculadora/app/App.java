package com.calculadora.app;

import javax.swing.JOptionPane;
import com.calculadora.controller.Calculadora;
public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0,0);

        String[] opcoes = {"somar","subtrair", "multiplicar", "dividir","Sair"};
        Object opcao;

        do {
            opcao=JOptionPane.showInputDialog(null,
            "Selecione uma opção: ",
            "Calculadora",
            JOptionPane.QUESTION_MESSAGE,
            null,opcoes,opcoes[0]);

            if (opcao!="Sair") {
                calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X: ")));
                calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y: ")));
                
            }

            if(opcao == "somar"){
                JOptionPane.showMessageDialog(
                null,
                "O resultado da soma é "+
                calculadora.somar(calculadora.getX(), calculadora.getY()),
                "Soma",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else if (opcao == "subtrair") {
                JOptionPane.showMessageDialog(
                null,
                "O resultado da subtração é "+
                calculadora.subtrair(calculadora.getX(), calculadora.getY()),
                "Subtração",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else if (opcao == "multiplicar") {
                JOptionPane.showMessageDialog(
                null,
                "O resultado da multiplicação é "+
                calculadora.multiplicar(calculadora.getX(), calculadora.getY()),
                "multplicar",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else if (opcao == "dividir") {
                JOptionPane.showMessageDialog(
                null,
                "O resultado da divisão é "+
                calculadora.dividir(calculadora.getX(), calculadora.getY()),
                "dividir",
                JOptionPane.INFORMATION_MESSAGE);
            }
            
            // switch (opcao) {
            //     case "somar":
            //         break;
            //     case "subtrair":
            //         break;
            //     case "multiplicar":
            //         break;
            //     case "dividir":
            //         break;
            // }
            
        } while (opcao!="Sair");



        // System.out.println("Hello, World!");
        // JOptionPane.showMessageDialog(null, "calculadora feita em java", "calculadora", 1);
        // JOptionPane.showInputDialog("Digite o primeiro número: ");
    }
}
