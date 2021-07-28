package Controller;

public class Funcionario {

    private String rg;
    private String nome;
    private Data nascimento;
    private Data dataAdmissao;
    private double salario;

    public Funcionario(String rg, String nome, String nascimento, String dataAdmissao, double salario) {
        this.rg = rg;
        this.nome = nome;
        this.nascimento.setData(dataAdmissao);
        this.dataAdmissao.setData(dataAdmissao);;
        this.salario = salario;
        
    }

    public String getRg() {
        return this.rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNascimento() {
        return this.nascimento.getData();
    }

    public String getDataAdmissao() {
        return this.dataAdmissao.getData();
    }

    public double getSalario() {
        return this.salario;
    }
}
