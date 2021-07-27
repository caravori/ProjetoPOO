package Controller;

public class Funcionario {

    private String rg;
    private String nome;
    private String nascimento;
    private String dataAdmissao;
    private double salario;

    public Funcionario(String rg, String nome, String nascimento, String dataAdmissao, double salario) {
        this.rg = rg;
        this.nome = nome;
        this.nascimento = nascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }
}
