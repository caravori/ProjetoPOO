package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Carro extends Veiculo {
	
	//atributos
	private int potencia;
	private int nCilindros;
	private int nOcupantes;
	private String dimensoes;
	
	//constructor
	public Carro(int nChassi, String marca, String modelo, int ano, int km, String tCombustivel, double peso, String status, String tipo,int pot,int cilindradas, int nOc, String dim) {
		super(nChassi,marca,modelo,ano,km,tCombustivel,peso,status,tipo);
		setNCilindros(cilindradas);
		setPotencia(pot);
		setNOcupantes(nOc);
		setDimensoes(dim);
	}
	
	//metodo para inserir no doc
	public void inserirCarro() throws IOException{
		FileWriter addCarro = new FileWriter("src/arquivos/carros.csv",true);
		addCarro.write(this.getChassi()+";");
		addCarro.write(this.getMarca()+";");
		addCarro.write(this.getModelo()+";");
		addCarro.write(this.getAno()+";");
		addCarro.write(this.getKilometragem()+";");
		addCarro.write(this.getTipoCombustivel()+";");
		addCarro.write(this.getPeso()+";");
		addCarro.write(this.getStatus()+";");
		addCarro.write(this.getTipo()+";");
		addCarro.write(this.getPotencia()+";");
		addCarro.write(this.getNCilindros()+";");
		addCarro.write(this.getNOcupantes()+";");
		addCarro.write(this.getDimensoes()+";");
		addCarro.close();
		
	}
	
	//-------------------------getters--------------------------
	public int getPotencia() {
		return this.potencia;
	}
	public int getNCilindros() {
		return this.nCilindros;
	}
	public int getNOcupantes() {
		return this.nOcupantes;
	}
	public String getDimensoes() {
		return this.dimensoes;
	}
	
	//--------------------------setters--------------------------
	public void setPotencia(int pot) {
		this.potencia = pot;
	}
	public void setNCilindros(int nCil) {
		this.nCilindros = nCil;
	}
	public void setNOcupantes(int nOc) {
		this.nOcupantes = nOc;
	}
	public void setDimensoes(String dim) {
		this.dimensoes = dim;
	}
}
