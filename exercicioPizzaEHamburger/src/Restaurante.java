import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {

        double valorF = 0;

        String pedido = JOptionPane.showInputDialog("Informe o pedido:\n1.Hamburger\n2.Pizza\n3.Sair");
        int menu = Integer.parseInt(pedido);
        switch (menu)
        {
            case 1:
                Hamburger hamburger = new Hamburger();

                String nome = JOptionPane.showInputDialog("Ingresse o nome do hamburger");
                Double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor do hamburger"));
                String respostaArtesanal = JOptionPane.showInputDialog("O hamburger é artesanal?\nDigite: \nSim S\nNão N");
                boolean artesanalParaCalcula;

                if(respostaArtesanal.equals("S")){
                    artesanalParaCalcula = true;
                }
                else{
                    artesanalParaCalcula = false;
                }
                hamburger.nome = nome;
                hamburger.valor = valor;
                double valorTotal = hamburger.calculaValor(artesanalParaCalcula);
                JOptionPane.showMessageDialog(null, "Valor do pedido: " + valorTotal, "Valor", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                Pizza pizza = new Pizza();
                nome = JOptionPane.showInputDialog("Ingresse o nome da pizza");
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor da pizza"));
                String possuiBorda = JOptionPane.showInputDialog("A pizza possui borda?\nDigite: \nSim S\nNão N");
                boolean bordaParaCalculo;

                if(possuiBorda.equals("S")){
                    bordaParaCalculo = true;
                }
                else{
                    bordaParaCalculo = false;
                }
                pizza.nome = nome;
                pizza.valor = valor;
                valorTotal = pizza.calcularValorP(bordaParaCalculo);
                JOptionPane.showMessageDialog(null, "Valor do pedido: " + valorTotal, "Valor", JOptionPane.INFORMATION_MESSAGE);
                break;




        }

    }
}
