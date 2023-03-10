package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contato contato = new Contato();

        System.out.println("Ingresse um nome para o contato ");
        String nome = sc.nextLine();
        contato.setNome(nome);

        System.out.println("Ingresse o numero de telefone valido ");
        String telefone = sc.next();
        contato.setTelefone(telefone);

        if(contato.getTelefone().length() != 9){
            System.out.println("Telefone invalido");
        }
        contato.excluir(contato);


        System.out.println("Incluir contato ");
        System.out.println("Ingresse um nome para o contato ");
        nome = sc.nextLine();
        contato.setNome(nome);
        sc.nextLine();

        System.out.println("Ingresse o numero de telefone valido ");
        telefone = sc.nextLine();
        contato.setTelefone(telefone);

        contato.incluir(contato);





    }
}
