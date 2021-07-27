package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Vendedor extends Funcionario{

    private String tempoTreinamento;
    private String gerenteResponsavel;

    public Vendedor(String rg, String nome, String nascimento, String dataAdmissao, double salario,String tempoTreinamento,String gerenteResponsavel) {
        super(rg, nome, nascimento, dataAdmissao, salario);
        this.tempoTreinamento = tempoTreinamento;
        this.gerenteResponsavel = gerenteResponsavel;
        
    }
    
    public void inserirVendedor() throws IOException {
    	FileWriter addGerente = new FileWriter("src/arquivos/vendedores.csv",true);
		addGerente.write(this.getNome()+";");
		addGerente.write(this.getRg()+";");
		addGerente.write(this.getNascimento()+";");
		addGerente.write(this.getDataAdmissao()+";");
		addGerente.write(this.getSalario()+";");
		addGerente.write(this.getTempoTreinamento()+";");
		addGerente.write(this.getGerenteResponsavel()+";");
		addGerente.close();
    }

    public String getTempoTreinamento() {
        return tempoTreinamento;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }
}
