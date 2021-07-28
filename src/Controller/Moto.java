package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(int nChassi, String marca, String modelo, int ano, int km, String tCombustivel, double peso, String status, int cilindradas, String tipo) {
		super(nChassi,marca,modelo,ano,km,tCombustivel,peso,status,tipo);
		setCilindradas(cilindradas);
	}
	
	public void inserirMoto() throws IOException{
		FileWriter addMoto = new FileWriter("src/arquivos/motos.csv",true);
		addMoto.write(this.getChassi()+";");
		addMoto.write(this.getMarca()+";");
		addMoto.write(this.getModelo()+";");
		addMoto.write(this.getAno()+";");
		addMoto.write(this.getKilometragem()+";");
		addMoto.write(this.getTipoCombustivel()+";");
		addMoto.write(this.getPeso()+";");
		addMoto.write(this.getStatus()+";");
		addMoto.write(this.getCilindradas()+";");
		addMoto.write(this.getTipo()+";");
		addMoto.close();
	}
	
	public int getCilindradas() {
		return this.cilindradas;
	}
	
	public void setCilindradas(int cil) {
		this.cilindradas = cil;
	}
}
