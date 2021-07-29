package View;

import Controller.*;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
	
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Gerente> gerentes = new ArrayList<>();
	ArrayList<Vendedor> vendedores = new ArrayList<>();
	ArrayList<Carro> carros = new ArrayList<>();
	ArrayList<Moto> motos = new ArrayList<>();
	ArrayList<Venda> vendas = new ArrayList<>();
	
	int i;
	public void save() { //TODO
		try {
			FileWriter addCliente = new FileWriter("src/arquivos/clientes.csv",false);
			for(i=0;i<clientes.size();i = i+6) {
				addCliente.write(clientes.get(i).getNome()+";");
				addCliente.write(clientes.get(i+1).getNasc()+";");
				addCliente.write(clientes.get(i+2).getCPF()+";");
				addCliente.write(clientes.get(i+3).getEndereco()+";");
				addCliente.write(clientes.get(i+4).getDependente()+";");
				addCliente.write(clientes.get(i+5).getRenda()+";");
			}
			System.out.println("VAI SE FUDE ALEARDO");
			addCliente.close();

			
		}catch(IOException e) {
			
		}
		try {
			FileWriter addGerente = new FileWriter("src/arquivos/gerentes.csv",false);
			for(i=0;i<clientes.size();i = i+6) {
				addGerente.write(gerentes.get(i).getNome()+";");
				addGerente.write(gerentes.get(i+1).getRg()+";");
				addGerente.write(gerentes.get(i+2).getNascimento()+";");
				addGerente.write(gerentes.get(i+3).getDataAdmissao()+";");
				addGerente.write(gerentes.get(i+4).getSalario()+";");
				addGerente.write(gerentes.get(i+5).getAnosExp()+";");
			}
			addGerente.close();
			
		}catch(IOException e) {
			
		}
		
		try {
			FileWriter addVendedor = new FileWriter("src/arquivos/vendedores.csv",false);
			for(i=0;i<vendedores.size();i = i + 7) {				
				addVendedor.write(vendedores.get(i).getNome()+";");
				addVendedor.write(vendedores.get(i+1).getRg()+";");
				addVendedor.write(vendedores.get(i+2).getNascimento()+";");
				addVendedor.write(vendedores.get(i+3).getDataAdmissao()+";");
				addVendedor.write(vendedores.get(i+4).getSalario()+";");
				addVendedor.write(vendedores.get(i+5).getTempoTreinamento()+";");
				addVendedor.write(vendedores.get(i+6).getGerenteResponsavel()+";");
			}
			addVendedor.close();
			
		}catch(IOException e) {
			
		}
		
		try {
			FileWriter addCarro = new FileWriter("src/arquivos/carros.csv",false);
			for(i=0;i<carros.size();i = i+13) {
				addCarro.write(carros.get(i).getChassi()+";");
				addCarro.write(carros.get(i+1).getMarca()+";");
				addCarro.write(carros.get(i+2).getModelo()+";");
				addCarro.write(carros.get(i+3).getAno()+";");
				addCarro.write(carros.get(i+4).getKilometragem()+";");
				addCarro.write(carros.get(i+5).getTipoCombustivel()+";");
				addCarro.write(carros.get(i+6).getPeso()+";");
				addCarro.write(carros.get(i+7).getStatus()+";");
				addCarro.write(carros.get(i+8).getTipo()+";");
				addCarro.write(carros.get(i+9).getPotencia()+";");
				addCarro.write(carros.get(i+10).getNCilindros()+";");
				addCarro.write(carros.get(i+11).getNOcupantes()+";");
				addCarro.write(carros.get(i+12).getDimensoes()+";");
			}
			addCarro.close();
			
		}catch(IOException e) {
			
		}
		
		try {
			FileWriter addMoto = new FileWriter("src/arquivos/motos.csv",false);
			for(i=0;i<carros.size();i = i+10) {
				addMoto.write(motos.get(i).getChassi()+";");
				addMoto.write(motos.get(i+1).getMarca()+";");
				addMoto.write(motos.get(i+2).getModelo()+";");
				addMoto.write(motos.get(i+3).getAno()+";");
				addMoto.write(motos.get(i+4).getKilometragem()+";");
				addMoto.write(motos.get(i+5).getTipoCombustivel()+";");
				addMoto.write(motos.get(i+6).getPeso()+";");
				addMoto.write(motos.get(i+7).getStatus()+";");
				addMoto.write(motos.get(i+8).getCilindradas()+";");
				addMoto.write(motos.get(i+9).getTipo()+";");
			
			}
			addMoto.close();
			
		}catch(IOException e) {
			
		}
		
		//NOVO METODO DA VENDA
		try {
			FileWriter addVenda = new FileWriter("src/arquivos/vendas.csv",false);
			for(i=0;i<vendas.size();i = i+8 ) {
				addVenda.write(vendas.get(i).getId + ";");
				addVenda.write(vendas.get(i+1).getValor() + ";");
				addVenda.write(vendas.get(i+2).getVendedor() + ";");
				addVenda.write(vendas.get(i+3).getCliente() + ";");
				addVenda.write(vendas.get(i+4).getMoto() + ";");
				addVenda.write(vendas.get(i+5).getCarro() + ";");
				addVenda.write(vendas.get(i+6).getData() + ";");
				addVenda.write(vendas.get(i+7).getHorario() + ";");
			}
			addVenda.close();
				
		} catch(IOException e) {
		
		}	
	}


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GuiMain.fxml"));
        primaryStage.setTitle("Inicio");
        Scene scene = new Scene(root,600,311);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        try {
			FileReader arqLeitura = new FileReader("src/arquivos/clientes.csv");
			BufferedReader leitura = new BufferedReader(arqLeitura);
			String[] dados;
			dados = leitura.readLine().split(";");
			for (i = 0; i < dados.length; i = i + 6) {
				Cliente novoCliente = new Cliente(dados[i], dados[i + 1], dados[i + 2], dados[i + 3], dados[i + 4], Double.parseDouble(dados[i + 5]));
				clientes.add(novoCliente);
			}
			arqLeitura.close();
			leitura.close();

		}catch (NullPointerException e){

		}
		try {
			FileReader arqLeitura = new FileReader("src/arquivos/gerentes.csv");
			BufferedReader leitura = new BufferedReader(arqLeitura);
			String[] dados;
			dados = leitura.readLine().split(";");
			for (i = 0; i < dados.length; i = i + 6) {
				Gerente novoGerente = new Gerente(dados[i], dados[i + 1], dados[i + 2], dados[i + 3], Double.parseDouble(dados[i + 4]), Integer.parseInt(dados[i + 5]));
				gerentes.add(novoGerente);
			}
			arqLeitura.close();
			leitura.close();
		}catch (NullPointerException e){

		}
		try {
			FileReader arqLeitura = new FileReader("src/arquivos/vendedores.csv");
			BufferedReader leitura = new BufferedReader(arqLeitura);
			String[] dados = leitura.readLine().split(";");
			for (i = 0; i < dados.length; i = i + 7) {
				Vendedor novoVendedor = new Vendedor(dados[i], dados[i + 1], dados[i + 2], dados[i + 3], Double.parseDouble(dados[i + 4]), dados[i + 5], dados[i + 6]);
				vendedores.add(novoVendedor);
			}
			arqLeitura.close();
			leitura.close();
		}catch (NullPointerException e){

		}
		try {
			FileReader arqLeitura = new FileReader("src/arquivos/carros.csv");
			BufferedReader leitura = new BufferedReader(arqLeitura);
			String[] dados = leitura.readLine().split(";");
			for (i = 0; i < dados.length; i = i + 13) {
				Carro novoCarro = new Carro(Integer.parseInt(dados[i]), dados[i + 1], dados[i + 2], Integer.parseInt(dados[i+3]), Integer.parseInt(dados[i + 4]),dados[i+5], Double.parseDouble(dados[i+6]), dados[i + 7], dados[i+8],Integer.parseInt(dados[i+9]),Integer.parseInt(dados[i+10]),Integer.parseInt(dados[i+11]),dados[i+12]);
				carros.add(novoCarro);
			}
			arqLeitura.close();
			leitura.close();
		}catch (NullPointerException e){

		}
		
		try {
			FileReader arqLeitura = new FileReader("src/arquivos/motos.csv");
			BufferedReader leitura = new BufferedReader(arqLeitura);
			String[] dados = leitura.readLine().split(";");
			for (i = 0; i < dados.length; i = i + 10) {
				Moto novaMoto = new Moto(Integer.parseInt(dados[i]), dados[i + 1], dados[i + 2], Integer.parseInt(dados[i+3]), Integer.parseInt(dados[i + 4]),dados[i+5], Double.parseDouble(dados[i+6]), dados[i + 7],Integer.parseInt(dados[i+8]),dados[i+9]);
				motos.add(novaMoto);
			}
			arqLeitura.close();
			leitura.close();
		}catch (NullPointerException e){
		
		}
	}


    public static void main(String[] args) {
        launch(args);
    }
}
