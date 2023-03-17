public class Hamburger {
    public String nome;
    public double valor;
    public boolean eArtesanal;

    public double calculaValor(boolean eArtesanal){
        if(eArtesanal){
            return valor + 8.00;
        }
        return valor;
    }

    public String ConsultarNome(){
        return nome;
    }
}
