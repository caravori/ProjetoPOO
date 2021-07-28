package Controller;

import java.io.*;

public class Cliente {
	private String nome;
	private String nascimento;
	private String cpf;
	private String endereco;
	private String dependente;
	private double renda;
	
	public Cliente(String nome, String nasc, String cpf, String end, String dep, double renda) {
		setNome(nome);
		setNasc(nasc);
		setCPF(cpf);
		setEndereco(end);
		setDependente(dep);
		setRenda(renda);
	}
	
	public void inserirCliente() throws IOException {
		FileWriter addCliente = new FileWriter("src/arquivos/clientes.csv",true);
		addCliente.write(this.getNome()+";");
		addCliente.write(this.getNasc()+";");
		addCliente.write(this.getCPF()+";");
		addCliente.write(this.getEndereco()+";");
		addCliente.write(this.getDependente()+";");
		addCliente.write(this.getRenda()+";");
		addCliente.close();
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNasc(String nasc) {
		this.nascimento = nasc;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(String end) {
		this.endereco = end;
	}
	public void setDependente(String dep) {
		this.dependente = dep;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getNome() {
		return this.nome;
	}
	public String getNasc() {
		return this.nascimento;
	}
	public String getCPF() {
		return this.cpf;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getDependente() {	
		return this.dependente;
	}
	public double getRenda() {
		return this.renda;
	}
}
