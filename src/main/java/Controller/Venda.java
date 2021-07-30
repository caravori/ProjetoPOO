package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Venda {
	
	//atributos
	private String idVenda;
	private double valor;
	private Vendedor vendedor;
	private Cliente cliente;
	private Moto moto;
	private Carro carro;
	private Data data;
	private Horario horario;
	public ArrayList<Carro> carrosComboBox = new ArrayList<>();
	public ArrayList<Moto> motosComboBox = new ArrayList<>();
	public ArrayList<Vendedor> vendedorComboBox = new ArrayList<>();
	public ArrayList<Cliente> clientesComboBox = new ArrayList<>();
	int i;
	
	//CONSTRUCTOR
	public Venda(String idVenda, double valor, Vendedor vendedor, Cliente cliente, Moto moto, Carro carro, Data data, Horario horario ) {
		
		this.idVenda = idVenda;
		this.valor = valor;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.moto = moto;
		this.carro = carro;
		this.data = data;
		this.horario = horario;
		
	}
	
	//Constructor vazio so para inicializar metodos
	public Venda(){

	}
	
	//metodo auxiliar para a o constructor vazio acima
	public void inserirDados(String idVenda, double valor, Vendedor vendedor, Cliente cliente, Moto moto, Carro carro, Data data, Horario horario ){
		this.idVenda = idVenda;
		this.valor = valor;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.moto = moto;
		this.carro = carro;
		this.data = data;
		this.horario = horario;
	}
	
	//metodo para pegar a array de carros por meio de leitura do documento carros.csv
	public void getArrayCarro() throws IOException{
		
		FileReader arquivo = new FileReader("src/arquivos/carros.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		String[] dados = leitor.readLine().split(";");
		for(i=0;i<dados.length; i = i+13){
			Carro novoCarro = new Carro(Integer.parseInt(dados[i]), dados[i+1],  dados[i+2], Integer.parseInt(dados[i+3]), Integer.parseInt(dados[i+4]), dados[i+5],Double.parseDouble(dados[i+6]), dados[i+7], dados[i+8],Integer.parseInt(dados[i+9]),Integer.parseInt(dados[i+10]), Integer.parseInt(dados[i+11]), dados[i+12]);
			carrosComboBox.add(novoCarro);
		}
		arquivo.close();
		leitor.close();
	}
	
	//metodo para pegar a array de motos por meio de leitura do documento motos.csv
	public void getArrayMoto() throws IOException{
		
		FileReader arquivo = new FileReader("src/arquivos/motos.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		String[] dados = leitor.readLine().split(";");
		for(i=0;i<dados.length; i = i+10){
			Moto novaMoto = new Moto(Integer.parseInt(dados[i]), dados[i+1],  dados[i+2], Integer.parseInt(dados[i+3]), Integer.parseInt(dados[i+4]), dados[i+5],Double.parseDouble(dados[i+6]), dados[i+7],Integer.parseInt(dados[i+8]),dados[i+9]);
			motosComboBox.add(novaMoto);
		}
		arquivo.close();
		leitor.close();
	}

	//metodo para pegar a array de clientes por meio do documento clientes.csv
	public void getArrayCliente() throws IOException{
		FileReader arquivo = new FileReader("src/arquivos/clientes.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		String[] dados = leitor.readLine().split(";");
		for(i=0;i<dados.length; i = i+7){
			Cliente novoCliente = new Cliente(dados[i], dados[i+1], dados[i+2], dados[i+3], dados[i+4],Double.parseDouble(dados[i+5]));
			clientesComboBox.add(novoCliente);
		}
		arquivo.close();
		leitor.close();
	}
	
	//metodo para pegar a array de vendedores por meio de leitura do documento vendedores.csv
	public void getArrayVendedor() throws IOException{
		FileReader arquivo = new FileReader("src/arquivos/vendedores.csv");
		BufferedReader leitor = new BufferedReader(arquivo);
		String[] dados = leitor.readLine().split(";");
		for(i=0;i<dados.length; i = i+7){
			Vendedor novoVendedor = new Vendedor(dados[i], dados[i+1], dados[i+2], dados[i+3], Double.parseDouble(dados[i+4]),dados[i+5],dados[i+6]);
			vendedorComboBox.add(novoVendedor);
		}
		arquivo.close();
		leitor.close();
	}
	
	//métodos javafx
	public void salvaCarro(int posicao) throws IOException{
		
		carrosComboBox.get(posicao).setChassi(carro.getChassi());
		carrosComboBox.get(posicao).setMarca(carro.getMarca());
		carrosComboBox.get(posicao).setModelo(carro.getModelo());
		carrosComboBox.get(posicao).setAno(carro.getAno());
		carrosComboBox.get(posicao).setKilometragem(carro.getKilometragem());
		carrosComboBox.get(posicao).setTipoCombustivel(carro.getTipoCombustivel());
		carrosComboBox.get(posicao).setPeso(carro.getPeso());
		carrosComboBox.get(posicao).setStatus(carro.getStatus());
		carrosComboBox.get(posicao).setTipo(carro.getTipo());
		carrosComboBox.get(posicao).setPotencia(carro.getPotencia());
		carrosComboBox.get(posicao).setNCilindros(carro.getNCilindros());
		carrosComboBox.get(posicao).setNOcupantes(carro.getNOcupantes());
		carrosComboBox.get(posicao).setDimensoes(carro.getDimensoes());
		FileWriter addCarro = new FileWriter("src/arquivos/carros.csv",false);
		for(i=0;i<carrosComboBox.size();i = i+13){
			addCarro.write(carrosComboBox.get(i).getChassi()+";");
			addCarro.write(carrosComboBox.get(i+1).getMarca()+";");
			addCarro.write(carrosComboBox.get(i+2).getModelo()+";");
			addCarro.write(carrosComboBox.get(i+3).getAno()+";");
			addCarro.write(carrosComboBox.get(i+4).getKilometragem()+";");
			addCarro.write(carrosComboBox.get(i+5).getTipoCombustivel()+";");
			addCarro.write(carrosComboBox.get(i+6).getPeso()+";");
			addCarro.write(carrosComboBox.get(i+7).getStatus()+";");
			addCarro.write(carrosComboBox.get(i+8).getTipo()+";");
			addCarro.write(carrosComboBox.get(i+9).getPotencia()+";");
			addCarro.write(carrosComboBox.get(i+10).getNCilindros()+";");
			addCarro.write(carrosComboBox.get(i+11).getNOcupantes()+";");
			addCarro.write(carrosComboBox.get(i+12).getDimensoes()+";");
		}
		addCarro.close();

	}
	public void salvaMoto(int posicao) throws IOException{
		
		motosComboBox.get(posicao).setChassi(moto.getChassi());
		motosComboBox.get(posicao).setMarca(moto.getMarca());
		motosComboBox.get(posicao).setModelo(moto.getModelo());
		motosComboBox.get(posicao).setAno(moto.getAno());
		motosComboBox.get(posicao).setKilometragem(moto.getKilometragem());
		motosComboBox.get(posicao).setTipoCombustivel(moto.getTipoCombustivel());
		motosComboBox.get(posicao).setPeso(moto.getPeso());
		motosComboBox.get(posicao).setStatus(moto.getStatus());
		motosComboBox.get(posicao).setTipo(moto.getTipo());
		motosComboBox.get(posicao).setCilindradas(moto.getCilindradas());
		
		FileWriter addMoto = new FileWriter("src/arquivos/motos.csv",false);
		for(i=0;i<motosComboBox.size();i = i+13){
			addMoto.write(motosComboBox.get(i).getChassi()+";");
			addMoto.write(motosComboBox.get(i+1).getMarca()+";");
			addMoto.write(motosComboBox.get(i+2).getModelo()+";");
			addMoto.write(motosComboBox.get(i+3).getAno()+";");
			addMoto.write(motosComboBox.get(i+4).getKilometragem()+";");
			addMoto.write(motosComboBox.get(i+5).getTipoCombustivel()+";");
			addMoto.write(motosComboBox.get(i+6).getPeso()+";");
			addMoto.write(motosComboBox.get(i+7).getStatus()+";");
			addMoto.write(motosComboBox.get(i+10).getCilindradas()+";");
			addMoto.write(motosComboBox.get(i+8).getTipo()+";");
		}
		addMoto.close();

	}
	
	
	//METODO INSERIR
	public void inserirVenda() throws IOException
	{
		FileWriter addVenda = new FileWriter("src/arquivos/vendas.csv", true);

		addVenda.write(this.getId() + ";");
		addVenda.write(this.getvalor() + ";");
		addVenda.write(this.vendedor.getRg() + ";");
		addVenda.write(this.cliente.getCPF() + ";");
		if(this.moto==null){
			addVenda.write(this.carro.getChassi() + ";");
		}
		else {
			addVenda.write(this.moto.getChassi() + ";");
		}
		addVenda.write(this.data.getDia() + ";");
		addVenda.write(this.horario.getHorario() + ";");
		addVenda.close();
	}
	
	//SETTERS
	public void setId(String idVenda) {
		this.idVenda = idVenda;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	
	//GETTERS
	public String getId() {
		return idVenda;
	}
	
	public double getvalor() {
		return valor;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Moto getMoto() {
		return moto;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public Data getData() {
		return data;
	}
	
	public Horario getHorario() {
		return horario;
	}
}
