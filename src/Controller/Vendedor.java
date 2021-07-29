package Controller;

import java.io.FileWriter;
import java.io.IOException;

public class Vendedor extends Funcionario{

    private String tempoTreinamento;
    private String gerenteResponsavel;

    public Vendedor(String rg, String nome, String nascimento, String dataAdmissao, double salario,String tempoTreinamento,String gerenteResponsavel) {

        super(rg, nome, nascimento.split("/"), dataAdmissao.split("/"), salario);
        this.tempoTreinamento = tempoTreinamento;
        this.gerenteResponsavel = gerenteResponsavel;
        
    }
    
    public void inserirVendedor() throws IOException {
    	FileWriter addVendedor = new FileWriter("src/arquivos/vendedores.csv",true);
		addVendedor.write(this.getNome()+";");
		addVendedor.write(this.getRg()+";");
		addVendedor.write(this.getNascimento()+";");
		addVendedor.write(this.getDataAdmissao()+";");
		addVendedor.write(this.getSalario()+";");
		addVendedor.write(this.getTempoTreinamento()+";");
		addVendedor.write(this.getGerenteResponsavel()+";");
		addVendedor.close();
    }

    public String getTempoTreinamento() {
        return tempoTreinamento;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }
}
