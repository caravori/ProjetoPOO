package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Vendedor extends Funcionario{
	
    //atributos
    private String tempoTreinamento;
    private String gerenteResponsavel;
	
    //constructor	
    public Vendedor(String rg, String nome, String nascimento, String dataAdmissao, double salario,String tempoTreinamento,String gerenteResponsavel) {

        super(rg, nome, nascimento.split("/"), dataAdmissao.split("/"), salario);
        this.tempoTreinamento = tempoTreinamento;
        this.gerenteResponsavel = gerenteResponsavel;
        
    }
    
    //método de inserção no doc	
    public void inserirVendedor() throws IOException {
    	FileWriter addVendedor = new FileWriter("src/arquivos/vendedores.csv",true);
		addVendedor.write(this.getRg()+";");
		addVendedor.write(this.getNome()+";");
		addVendedor.write(this.getNascimento()+";");
		addVendedor.write(this.getDataAdmissao()+";");
		addVendedor.write(this.getSalario()+";");
		addVendedor.write(this.getTempoTreinamento()+";");
		addVendedor.write(this.getGerenteResponsavel()+";");
		addVendedor.close();
    }
	
    //---------------------------getters---------------------------	
    public String getTempoTreinamento() {
        return tempoTreinamento;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }
			
}
