package ExemploTryCatch;

import java.util.Scanner;

public class ExemloThrow{

    public static final String SENHASECRETA = "123456";

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();
            if(!senha.equals(SENHASECRETA)){
                throw new Exception("Senha invalida!!!");
            }
            System.out.println("Senha correta!!!\nBem vinda(a)!!!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
