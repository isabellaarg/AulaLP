package TarefaComplementarArquivo;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        String path = "C:/Users/12116340/Documents/Lp/Contas.txt";

        //String nomeCliente = JOptionPane.showInputDialog("Escreva o nome do cliente");
        //Cliente cliente= new Cliente();

        //String nomeBanco = JOptionPane.showInputDialog("Escreva o nome do banco");
        Banco banco = new Banco();

        ManipularLeitor m = new ManipularLeitor();
        m.leitorConta(path);

        banco.calcularTotal();
    }
}
