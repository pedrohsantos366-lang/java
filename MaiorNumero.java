import javax.swing.JOptionPane; 

public class MaiorNumero { 
    public static void main(String[] args) { 

        int[] pontos = new int[6]; 
        int maior = Integer.MIN_VALUE; 

        for (int i = 0; i < pontos.length; i++) {
           
            String entrada = JOptionPane.showInputDialog("Digite a pontuação " + (i + 1) + ":");
            pontos[i] = Integer.parseInt(entrada);
            if (pontos[i] > maior) {
                maior = pontos[i]; 
            }
        }
        String lista = "";
        for (int p : pontos) {
            lista += p + " ";
        }
        JOptionPane.showMessageDialog(
            null,
            "Pontuações digitadas: " + lista + "\nRecorde (maior pontuação): " + maior
        );
    }
}