package TarefaComplementarArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
    public String nomeBanco;
    ArrayList<Conta> contas = new ArrayList<>();

    public double calcularTotal() {
        double saldoTotal = 0;
        for(Conta contas : contas) {
            saldoTotal += contas.saldo;
        }
        return saldoTotal;
    }


}
