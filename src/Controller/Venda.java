package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Venda {
	private int idVenda;
	private double valor;
	private Vendedor vendedor;
	private Cliente cliente;
	private Moto moto;
	private Carro carro;
	private Data data;
	private Horario horario;
	
	//CONSTRUCTOR
	public Venda(int idVenda, double valor, Vendedor vendedor, Cliente cliente, Moto moto, Carro carro, Data data, Horario horario ) {
		
		this.idVenda = idVenda;
		this.valor = valor;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.moto = moto;
		this.carro = carro;
		this.data = data;
		this.horario = horario;
		
	}
	
	//METODO INSERIR
	public void inserirVenda() throws IOException
	{
		FileWriter addVenda = new FileWriter("src/arquivos/vendas.csv", true);
			addVenda.write(this.getId() + ";");
			addVenda.write(this.getvalor() + ";");
			addVenda.write(this.getVendedor() + ";");
			addVenda.write(this.getCliente() + ";");
			addVenda.write(this.getMoto() + ";");
			addVenda.write(this.getCarro() + ";");
			addVenda.write(this.getData() + ";");
			addVenda.write(this.getHorario() + ";");
	}
	
	//SETTERS
	public void setId(int idVenda) {
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
	public int getId() {
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
