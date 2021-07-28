package Controller;

public class Venda {
	private int idVenda;
	private double valor;
	private Vendedor vendedor;
	private Cliente cliente;
	private Moto moto;
	private Carro carro;
	private Data data;
	private Horario horario;
	
	public Venda() {
		
	}
	
	public void setId(int id) {
		this.idVenda = id;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setVendedor() {
		//TODO
	}
	
}
