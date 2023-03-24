import javax.swing.*;

public class framesPanels {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Interface Gráfica");

        JButton botao = new JButton("Botão do Swing");

        JLabel texto = new JLabel("Número de clicks: 0");

        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);

        janela.setSize(300, 200);
        janela.show();
    }
}
