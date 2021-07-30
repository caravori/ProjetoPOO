package Controller;

import java.io.FileWriter; 
import java.io.IOException;

public class Gerente extends Funcionario{
	
    //atributos	
    private int anosExp;
	
    //constructor	
    public Gerente(String rg, String nome, String nascimento, String dataAdmissao, double salario,int anosExp){
        super(rg, nome, nascimento.split("/"), dataAdmissao.split("/"), salario);
        this.anosExp = anosExp;
    
    }
	
    //método de inserção no documento
    public void inserirGerente() throws IOException {
	//abertura do doc
        FileWriter addGerente = new FileWriter("src/arquivos/gerentes.csv",true);
	    	//inserção dos atributos
		addGerente.write(this.getNome()+";");
		addGerente.write(this.getRg()+";");
		addGerente.write(this.getNascimento()+";");
		addGerente.write(this.getDataAdmissao()+";");
		addGerente.write(this.getSalario()+";");
		addGerente.write(this.getAnosExp()+";");
		addGerente.close(); //fechamento do doc
    }
	
    //getter	
    public int getAnosExp() {
        return anosExp;
    }
	
}
