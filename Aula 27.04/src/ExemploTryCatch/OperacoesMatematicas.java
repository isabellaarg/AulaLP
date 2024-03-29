package TratamentoExcecao;

import javax.swing.*;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        System.out.println("Início do Programa.");
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));
            System.out.println("Divisão = " + (a / b));
            System.out.println("Multiplicação = " + (a * b));
            System.out.println("Soma = " + (a + b));
            System.out.println("Subtração = " + (a - b));
        } catch (ArithmeticException e1){
            System.out.println("Não pode dividir por zero!");
        } catch (NumberFormatException e2){
            System.out.println("Digite um número valido");
        }
        System.out.println("Fim do Programa.");
    }
}
