package Controller;

public class Vendedor extends Funcionario{

    private String tempoTreinamento;
    private String gerenteResponsavel;

    public Vendedor(String rg, String nome, String nascimento, String dataAdmissao, double salario,String tempoTreinamento,String gerenteResponsavel) {
        super(rg, nome, nascimento, dataAdmissao, salario);
        this.tempoTreinamento = tempoTreinamento;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public String getTempoTreinamento() {
        return tempoTreinamento;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }
}
