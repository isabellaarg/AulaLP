import javax.swing.*;

public class Media_Ler {
    public static void main(String[] args) {

        float nota1, nota2, calculaMedia;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));

        calculaMedia = (nota1 + nota2)/2;

        JOptionPane.showMessageDialog(null, "Resultado da Media = " + calculaMedia, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
