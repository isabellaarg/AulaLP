package SerializacaoExemplo;

import Serializacao1.ManipuladorArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        String path = "C:/Users/12116340/Documents/Lp/ArquivoNomes.txt";
        String path2 = "C:/Users/12116340/Documents/Lp/SobreNomes.txt";
        String path3 = "C:/Users/12116340/Documents/Lp/Concatenado.txt";

        ManipuladorArquivo1.juntar(path, path2, path3);

    }
}
