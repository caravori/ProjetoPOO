package View;

import java.io.*;
import java.util.ArrayList;

import Controller.GuiCadastro;
import Controller.Vendedor;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import Controller.Cliente;
import Controller.Gerente;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GuiMain.fxml"));
        primaryStage.setTitle("Inicio");
        Scene scene = new Scene(root,600,250);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        int i;
        FileReader arqLeitura = new FileReader("..\\arquivos\\Clientes.csv");
    	BufferedReader leitura = new BufferedReader(arqLeitura);
    	ArrayList<Cliente> clientes = new ArrayList<>();
    	String[] dados = leitura.readLine().split(";");
    	for(i=0;i<dados.length;i = i+6) {
    		Cliente novoCliente = new Cliente(dados[i],dados[i+1],dados[i+2],dados[i+3],dados[i+4],Double.parseDouble(dados[i+5]));
    		clientes.add(novoCliente);
    	}
    	arqLeitura.close();
    	leitura.close();
    	ArrayList<Gerente> gerentes = new ArrayList<>();
    	arqLeitura = new FileReader("..\\arquivos\\gerentes.csv");
    	leitura = new BufferedReader(arqLeitura);
    	dados = leitura.readLine().split(";");
    	for(i=0;i<dados.length;i = i+6) {
    		Gerente novoGerente = new Gerente(dados[i],dados[i+1],dados[i+2],dados[i+3],Double.parseDouble(dados[i+4]),Integer.parseInt(dados[i+5]));
    		gerentes.add(novoGerente);
    	}
    	arqLeitura.close();
    	leitura.close();
    	ArrayList<Vendedor> vendedores = new ArrayList<>();
    	arqLeitura = new FileReader("..\\arquivos\\vendedores.csv");
    	leitura = new BufferedReader(arqLeitura);
    	dados = leitura.readLine().split(";");
    	for(i=0;i<dados.length;i = i+7) {
    		Vendedor novoVendedor = new Vendedor(dados[i],dados[i+1],dados[i+2],dados[i+3],Double.parseDouble(dados[i+4]),dados[i+5],dados[i+6]);
    		vendedores.add(novoVendedor);
    	}
    	arqLeitura.close();
    	leitura.close();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
