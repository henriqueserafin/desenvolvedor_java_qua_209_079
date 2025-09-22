import javax.swing.JOptionPane;

public class MultaVeiculo {
    public static void main(String[] args) {
        try {
            // Recebe o modelo do veículo
            String modelo = JOptionPane.showInputDialog(
                null, 
                "Digite o modelo do veículo:", 
                "Dados do Veículo", 
                JOptionPane.QUESTION_MESSAGE
            );
            
            // Recebe a velocidade no primeiro pardal
            String velocidade1Str = JOptionPane.showInputDialog(
                null, 
                "Digite a velocidade no primeiro pardal (km/h):", 
                "Primeiro Pardal", 
                JOptionPane.QUESTION_MESSAGE
            );
            double velocidade1 = Double.parseDouble(velocidade1Str);
            
            // Recebe a velocidade no segundo pardal
            String velocidade2Str = JOptionPane.showInputDialog(
                null, 
                "Digite a velocidade no segundo pardal (km/h):", 
                "Segundo Pardal", 
                JOptionPane.QUESTION_MESSAGE
            );
            double velocidade2 = Double.parseDouble(velocidade2Str);
            
            // Recebe a distância entre os pardais
            String distanciaStr = JOptionPane.showInputDialog(
                null, 
                "Digite a distância entre os pardais (metros):", 
                "Distância", 
                JOptionPane.QUESTION_MESSAGE
            );
            double distancia = Double.parseDouble(distanciaStr);
            
            // Calcula a velocidade final (baseado na fórmula fornecida)
            double velocidadeFinal = velocidade1 / distancia;
            
            // Verifica se há multa (limite de 80 km/h)
            double limiteVelocidade = 80.0;
            boolean multaVel1 = velocidade1 > limiteVelocidade;
            boolean multaVel2 = velocidade2 > limiteVelocidade;
            boolean multaVelFinal = velocidadeFinal > limiteVelocidade;
            
            // Monta a mensagem de resultado
            StringBuilder resultado = new StringBuilder();
            resultado.append("=== RELATÓRIO DE VELOCIDADE ===\n");
            resultado.append("Modelo: ").append(modelo).append("\n");
            resultado.append("Limite da via: ").append(limiteVelocidade).append(" km/h\n\n");
            
            resultado.append("Velocidade 1º pardal: ").append(velocidade1).append(" km/h");
            resultado.append(multaVel1 ? " - MULTA!" : " - OK").append("\n");
            
            resultado.append("Velocidade 2º pardal: ").append(velocidade2).append(" km/h");
            resultado.append(multaVel2 ? " - MULTA!" : " - OK").append("\n");
            
            resultado.append("Distância entre pardais: ").append(distancia).append(" metros\n");
            resultado.append("Velocidade final calculada: ").append(String.format("%.2f", velocidadeFinal)).append(" km/h");
            resultado.append(multaVelFinal ? " - MULTA!" : " - OK").append("\n\n");
            
            // Resultado final
            if (multaVel1 || multaVel2 || multaVelFinal) {
                resultado.append("🚨 VEÍCULO RECEBERÁ MULTA! 🚨");
            } else {
                resultado.append("✅ VEÍCULO NÃO RECEBERÁ MULTA");
            }
            
            // Exibe o resultado
            JOptionPane.showMessageDialog(
                null, 
                resultado.toString(), 
                "Resultado da Verificação", 
                JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Erro: Digite apenas números válidos para velocidade e distância!", 
                "Erro de Entrada", 
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Erro inesperado: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}