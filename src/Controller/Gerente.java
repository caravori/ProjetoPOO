package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Gerente extends Funcionario{

    private int anosExp;

    public Gerente(String rg, String nome, String nascimento, String dataAdmissao, double salario,int anosExp){
        super(rg, nome, nascimento.split("/"), dataAdmissao.split("/"), salario);
        this.anosExp = anosExp;
    
    }
    public void inserirGerente() throws IOException {
        FileWriter addGerente = new FileWriter("src/arquivos/gerentes.csv",true);
		addGerente.write(this.getNome()+";");
		addGerente.write(this.getRg()+";");
		addGerente.write(this.getNascimento()+";");
		addGerente.write(this.getDataAdmissao()+";");
		addGerente.write(this.getSalario()+";");
		addGerente.write(this.getAnosExp()+";");
		addGerente.close();
    }

    public int getAnosExp() {
        return anosExp;
    }
}
