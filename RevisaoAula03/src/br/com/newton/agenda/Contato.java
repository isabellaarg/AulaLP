package br.com.newton.agenda;

import java.awt.peer.CanvasPeer;

public class Contato {
    private String nome;
    private String telefone;


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Criar um metodo Excluir que não tem retorno e que receba como parametro um contato a ser excluido
    // Escrever uma mensagem "Excluindo o contato" nome do contato
    public void excluir(Contato contato){
        System.out.println("Excluindo o contato: " + contato.nome);

    }

    public void incluir(Contato contato){
        System.out.println("Contato incluido: " + contato.nome );
    }

}
