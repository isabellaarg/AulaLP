import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do Açaí desejado:\n300 ml\n500 ml\n700 ml"));
        boolean temSorvete = JOptionPane.showInputDialog(null, "Haverá acréscimo de sorvete? (Sim/Não)").equalsIgnoreCase("Sim");

        Acai acai = new Acai(tamanho, temSorvete);

        JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: R$ " + String.format("%.2f", acai.getValor()));
    }
}