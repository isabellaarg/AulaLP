public class Pizza {
    public String nome;
    public double valor;
    public boolean possuiBorda;

    public double calcularValorP(boolean possuiBorda){
        if(possuiBorda){
            return valor + 5.00;
        }
        return valor;

    }
    public String ConsultarNomeP(){
        return nome;
    }
}
