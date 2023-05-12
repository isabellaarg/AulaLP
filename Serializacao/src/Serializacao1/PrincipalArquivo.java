package Serializacao1;

import java.io.IOException;

public class PrincipalArquivo {
    public static void main(String [] args) throws IOException{
        String path = "C:/Users/12116340/Documents/Lp/Exemplo.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}
