package Controller;

public abstract class Veiculo {
	private int numChassi;
	private String marca;
	private String modelo;
	private int ano;
	private int kilometragem;
	private String tipoCombustivel;
	private double peso;
	private String status;
	private String tipo;
	
	public Veiculo(int nChassi, String marca, String modelo, int ano, int km, String tCombustivel, double peso, String status, String tipo) {
		setChassi(nChassi);
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		setKilometragem(km);
		setTipoCombustivel(tCombustivel);
		setPeso(peso);
		setStatus(status);
		setTipo(tipo);
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public int getChassi() {
		return this.numChassi;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAno() {
		return this.ano;
	}
	public int getKilometragem() {
		return this.kilometragem;
	}
	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}
	public double getPeso() {
		return this.peso;
	}
	public String getStatus() {
		return this.status;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setKilometragem(int km) {
		this.kilometragem = km;
	}
	public void setTipoCombustivel(String combustivel) {
		this.tipoCombustivel = combustivel;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
