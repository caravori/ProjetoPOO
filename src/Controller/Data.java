package Controller;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dd,int mm, int aaaa) {
		setDia(dd);
		setMes(mm);
		setAno(aaaa);
	}
	
	public String getData() {
		return (String.valueOf(this.dia)+"/"+String.valueOf(this.mes)+"/"+String.valueOf(this.ano));
	}
	
	public void setData(String data) {
		String[] dados = data.split("/");
		setDia(Integer.parseInt(dados[0]));
		setMes(Integer.parseInt(dados[1]));
		setAno(Integer.parseInt(dados[2]));
	}
	
	public void setDia(int dd) {
		if(dd>0&&dd<32) {			
			this.dia = dd;
		}else {
			System.out.println("Dia incorreto");
			this.dia = -1;
		}
	}
	public void setMes(int mm) {
		if(mm>0&&mm<13) {			
			this.mes = mm;
		}else {
			System.out.println("Mes incorreto");
			this.mes = -1;
		}
	}
	public void setAno(int aaaa) {
		if(aaaa > 1949 && aaaa < 2051) {
			this.ano = aaaa;
		}
		else {
			System.out.println("Ano incorreto");
			this.ano = -1;
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
}
