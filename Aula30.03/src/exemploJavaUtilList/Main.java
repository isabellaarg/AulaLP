package exemploJavaUtilList;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        ContaCorrente c1 = new ContaCorrente();

        cl1.nome = JOptionPane.showInputDialog("Ingresse o nome do titular da conta: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor a depositar"));
        c1.deposita(valor);
        c1.cliente = cl1;

        Cliente cl2 = new Cliente();
        ContaCorrente c2 = new ContaCorrente();
        cl2.nome = JOptionPane.showInputDialog("Ingresse o nome do titular da conta: ");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor a depositar"));
        c2.deposita(valor);
        c2.cliente = cl2;


        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        System.out.println(contas.size());

        for(int i=0; i<contas.size(); i++){
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta pertence a: " + cc.nome + cc.saldo);
        }





    }
}
