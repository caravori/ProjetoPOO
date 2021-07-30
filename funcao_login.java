//package loginTest;

//OBS: lembre de mudar a package caso for rodar!

//OBS 2: por favor nao edite o documento pass.txt manualmente,
//o programa começa a ter um comportamento estranho

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
  //ABAIXO É A FUNÇÃO LOGIN!
	//ela recebe um usuario e uma senha. ai ela
	//retorna 0: senha ou usuário errados
	//retorna 1: senha e usuário corretos, vendedor
	//retorna 2: senha e usuário corretos, gerente
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
				if(userInput.equals(user) && passInput.equals(pass) && tipo.equals("vendedor"))
				{
					//fechamento do scan
					arqRead.close();
					read.close();					
					return 1; //match para vendedor
					
				}else if(userInput.equals(user) && passInput.equals(pass) && tipo.equals("gerente"))
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
	
	//ABAIXO É A FUNÇÃO ADDLOGIN!
  //ela recebe o nome, a senha e o tipo do novo usuário, e
	//ai ela faz append no documento
  //OBS: utilize as palavras "gerente" ou "vendedor" no tipo
	public static void addLogin(String newUser, String newPass, String tipo) 
	{
		try {
			FileWriter write = new FileWriter("src/arquivos/pass.txt", true);
			write.write(newUser + ";" + newPass + ";" + tipo + ";"); //escrita do novo usuário
			write.close();
			
		} catch (IOException e) {
			System.out.println("IOEXCEPTION!!!");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		//prompt informativo :)
		System.out.println("Foram adicionados ao sistema os usuários:");
		System.out.println("vendedor \"jao\" com senha \"senha\" ");
		System.out.println("gerente \"ze\" com senha \"123\" ");
		System.out.println("");
		
		//utilizacao da funcao addlogin
		addLogin("ze", "123", "gerente");
		addLogin("jao", "senha", "vendedor");
		
		//utilizacao da funcao login
		int i = login("jao", "senha");
		int j = login("ze", "123");
		int h = login("hacker", "l33t");
		
		//prompt informativo :)
		System.out.println("output para  login(\"jao\", \"senha\"): " + i);
		System.out.println("output para  login(\"ze\", \"123\"): "+ j);
		System.out.println("output para  login(\"hacker\", \"l33t\"): "+ h);
		
		
	}

}
