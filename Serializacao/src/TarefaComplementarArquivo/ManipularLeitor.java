package TarefaComplementarArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManipularLeitor {
    public void leitorNumero(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                String [] linhaItem = linha.split(",");
                //Mostra saldo
                for(int i=0; i< linhaItem.length; i++){
                    System.out.println(linhaItem[0]);
                }
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public void leitorConta(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        ArrayList<Conta> contas = new ArrayList<>();
        String linha = " ";
        while (true) {
            if (linha != null) {
                String [] linhaItem = linha.split(",");
                Conta conta = new Conta();
                conta.setAgencia(linhaItem[0]);
                conta.setNumero(linhaItem[1]);
                conta.setSaldo(Double.parseDouble(linhaItem[2]));

                contas.add(conta);
                
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                String [] linhaItem = linha.split(",");
                //Mostra saldo
                for(int i=2; i< linhaItem.length; i++){
                    System.out.println(linhaItem[2]);
                    double valoresSaldo = Double.parseDouble(linhaItem[2]);
                }
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

}
