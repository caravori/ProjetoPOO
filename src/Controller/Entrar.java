package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Entrar {
    
    //função login recebe um usuario e uma senha
    //retorna 0 se nao houver match com as informacoes no documento
    //retorna 1 se houver match e o usuario for vendedor
    //retorna 2 se houver match e o usuario for gerente
    public static int login(String userInput, String passInput) throws IOException {

        try {

            //abertura de arquivos
            FileReader arqRead = new FileReader("src/arquivos/pass.txt");
            BufferedReader read = new BufferedReader(arqRead);


            //leitura do documento
            String out = read.readLine();

            //variavel para a identificacao de cada dado
            String[] dados;

            //corte de cada dado
            dados = out.split(";");


            //loop para checagem da senha
            for (int i = 0; i < dados.length; i = i + 3)
            {
                //registro de cada dado
                String user = dados[i];
                String pass = dados[i+1];
                String tipo = dados[i+2];

                //PRINTS PARA DEBUG
                //System.out.println(dados[i]);
                //System.out.println(dados[i+1]);
                //System.out.println(dados[i+2]);


                //match da senha
                if(userInput.equals(user) && passInput.equals(pass) && tipo.equals("1")) //tipo == 2 quer dizer que há um match para vendedor
                {
                    //fechamento do scan
                    arqRead.close();
                    read.close();
                    return 1; //match para vendedor

                }else if(userInput.equals(user) && passInput.equals(pass) && tipo.equals("2")) //tipo == 1 quer dizer que há um match para gerente 
                {
                    //fechamento do scan
                    arqRead.close();
                    read.close();
                    return 2; //match para gerente
                }

            }

            //fechamento do scan
            arqRead.close();
            read.close();

        }catch(NullPointerException e) {
            //erro q as vezes da
            System.out.println("NULLPOINTEREXCEPTION");
        }

        return 0; // retorno de 0 caso nao tenha acontecido nenhum match

    }
    
    //função para adicionar um novo usuário
    public static void addLogin(String newUser, String newPass, String tipo)
    {
        try {
            //abertura do documento
            FileWriter write = new FileWriter("src/arquivos/pass.txt", true);
            write.write(newUser + ";" + newPass + ";" + tipo + ";"); //escrita do novo usuário
            write.close(); // fechamento do documento

        } catch (IOException e) {
            System.out.println("IOEXCEPTION!!!");
        }

    }
}
