package Controller;

public abstract class Horario {
	
	//atributos
	private int hora;
	private int minuto;
	
	//constructor
	public Horario(int hh, int mm) {
		setHora(hh);
		setMinuto(mm);
	}
	
	//pseudosetter setter
	public void setHorario(String horario) {
		String[] dados = horario.split(":");
		setHora(Integer.parseInt(dados[0]));
		setMinuto(Integer.parseInt(dados[1]));
	}
	
	//pseudogetter horario
	public String getHorario() {
		return (String.valueOf(this.hora)+":"+String.valueOf(this.minuto));
	}
	
	//metodos de construção do horario completo
	public void setHora(int hh) {
		if(hh>=0 && hh<24) {
			this.hora = hh;
		}
		else {
			this.hora = -1;
		}
	}
	public void setMinuto(int mm) {
		if(mm>=0 && mm<24) {
			this.minuto = mm;
		}
		else {
			this.minuto = -1;
		}
	}
	
	//getter coiso
	public int getHora() {
		return this.hora;
	}
	public int getMinuto() {
		return this.minuto;
	}
}
