package br.com.franquiaacai;

import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {
        Acai acai = new Acai();
        double valorTotal;
        boolean acresimoParaCalcular;

        String menu = JOptionPane.showInputDialog("Informe o tamanho do Açaí desejado:\n300 ml\n500 ml\n700 ml");
        int tamanho = Integer.parseInt(menu);


        if(tamanho == 300){
            String respostaAcresimo = JOptionPane.showInputDialog("O açaí vai ter acréscimo de sorvete?\nDigite: \nSim S\nNão N");

            if(respostaAcresimo.equals("S")){
                acresimoParaCalcular = true;
            }
            else {
                acresimoParaCalcular = false;
            }
            valorTotal = acai.calculaValorAcai(8,acresimoParaCalcular);

            JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + valorTotal, "Valor", JOptionPane.INFORMATION_MESSAGE);
        }
        if(tamanho == 500){
            String respostaAcresimo = JOptionPane.showInputDialog("O açaí vai ter acréscimo de sorvete?\nDigite: \nSim S\nNão N");

            if(respostaAcresimo.equals("S")){
                acresimoParaCalcular = true;
            }
            else {
                acresimoParaCalcular = false;
            }
            valorTotal = acai.calculaValorAcai(10,acresimoParaCalcular);

            JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + valorTotal, "Valor", JOptionPane.INFORMATION_MESSAGE);
        }
        if(tamanho == 700){
            String respostaAcresimo = JOptionPane.showInputDialog("O açaí vai ter acréscimo de sorvete?\nDigite: \nSim S\nNão N");

            if(respostaAcresimo.equals("S")){
                acresimoParaCalcular = true;
            }
            else {
                acresimoParaCalcular = false;
            }
            valorTotal = acai.calculaValorAcai(12,acresimoParaCalcular);

            JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + valorTotal, "Valor", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
