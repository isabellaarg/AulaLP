import javax.swing.JOptionPane;

public class Acai {
    private int tamanho; // Tamanho em ml
    private double valor; // Valor em reais
    private boolean temSorvete; // Se tem acréscimo de sorvete ou não

    // Construtor da classe
    public Acai(int tamanho, boolean temSorvete) {
        this.tamanho = tamanho;
        this.temSorvete = temSorvete;
        this.valor = calcularValor();
    }

    // Método para calcular o valor do açaí com base no tamanho e se tem acréscimo de sorvete
    private double calcularValor() {
        if (tamanho == 300) {
            valor = 8.00;
        } else if (tamanho == 500) {
            valor = 10.00;
        } else if (tamanho == 700) {
            valor = 12.00;
        }
        if (temSorvete) {
            valor += 2.00;
        }
        return valor;
    }

    // Getter para o valor do açaí
    public double getValor() {
        return valor;
    }
}
