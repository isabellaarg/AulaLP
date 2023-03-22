package br.com.franquiaacai;

public class Acai {
    public int tamanho;
    public double valor;
    public  boolean possuiAcrescimo;

    public Acai() {
        this.tamanho = tamanho;
        this.possuiAcrescimo = possuiAcrescimo;
    }



    public double calculaValorAcai(double valor, boolean possuiAcrescimo){
        if(tamanho == 300){
            valor = 8.00;
        }
        else if(tamanho == 500){
            valor = 10.00;
        } else if (tamanho == 700) {
            valor = 12.00;
        }
        if(possuiAcrescimo){
            valor += 2.00;
        }
        return valor;

    }



}
