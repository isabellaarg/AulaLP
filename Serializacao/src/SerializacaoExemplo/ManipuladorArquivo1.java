package SerializacaoExemplo;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo1 {
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void juntar(String path, String path2, String path3) throws IOException {
        BufferedReader buffNome = new BufferedReader(new FileReader(path));
        BufferedReader buffSobrenome = new BufferedReader(new FileReader(path2));
        BufferedWriter buffCompleto = new BufferedWriter(new FileWriter(path3));
        String completo = "";


        while (true) {
            completo = buffNome.readLine() + " " + buffSobrenome.readLine();
            if (!completo.equals("null null")) {
                System.out.println(completo);
                buffCompleto.append(completo);
            }
            else
                break;
            }
        buffNome.close();
        buffSobrenome.close();
        buffCompleto.close();

    }

    //Jeito da professora
    public static void juntar2(String path, String path2, String path3) throws IOException {
        BufferedReader buffNome = new BufferedReader(new FileReader(path));
        BufferedReader buffSobrenome = new BufferedReader(new FileReader(path2));
        BufferedWriter buffCompleto = new BufferedWriter(new FileWriter(path3));

        String linhaNome, linhaSobrenome;

        while((linhaNome = buffNome.readLine()) != null && (linhaSobrenome = buffSobrenome.readLine()) != null){
            //append e write serve pora escrever
            buffCompleto.write(linhaNome + " " + linhaSobrenome + "\n");
        }
        buffNome.close();
        buffSobrenome.close();
        buffCompleto.close();


    }

    }


