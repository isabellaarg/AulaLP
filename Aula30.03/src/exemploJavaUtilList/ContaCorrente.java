package exemploJavaUtilList;

public class ContaCorrente extends Cliente{
     double saldo;
     String nome;
     Cliente cliente;

    public ContaCorrente() {
    }


    public void saca(double valor){
        saldo-= valor;
    }
    public void deposita(double valor){
        saldo+= valor;
    }
}
