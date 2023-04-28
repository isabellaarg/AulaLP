package ExemploTryCatch;


import static com.sun.javafx.fxml.expression.Expression.divide;

public class Divide2 {
    public static void main(String[] args) {
        try {
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            divide(dividendo, divisor);
        } catch (ArithmeticException e1){
            System.out.println("Não pode dividir por zero! ");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Favor Informar dois números! ");
        }
        public static void divide(int dividendo, int divisor){
            System.out.println("Divisão = " + (dividendo/divisor));
        }

    }
}
