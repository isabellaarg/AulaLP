package br.com.newton.main;

import br.com.newton.agenda.Contato;

import javax.swing.*;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contato contato = new Contato();


        String nome = JOptionPane.showInputDialog("Ingresse um nome para o contato");
        contato.setNome(nome);

        String telefone = JOptionPane.showInputDialog("Ingresse o numero de telefone valido");
        contato.setTelefone(telefone);

        if(contato.getTelefone().length() != 9){
            JOptionPane.showMessageDialog(null, "Telefone invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        contato.excluir(contato);

        JOptionPane.showMessageDialog(null, "Incluir contato", "Contato", JOptionPane.INFORMATION_MESSAGE);
        nome = JOptionPane.showInputDialog("Ingresse um nome para o contato");
        contato.setNome(nome);

        telefone = JOptionPane.showInputDialog("Ingresse o numero de telefone valido");
        contato.setTelefone(telefone);

        contato.incluir(contato);




    }
}
