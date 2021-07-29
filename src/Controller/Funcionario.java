package Controller;

public abstract class Funcionario {

    private String rg;
    private String nome;
    private Data nascimento;
    private Data dataAdmissao;
    private double salario;

    public Funcionario(String rg, String nome, String[] nasci, String[] dataAd, double salario) {
        this.rg = rg;
        this.nome = nome;
        this.nascimento = new Data(Integer.parseInt(nasci[0]),Integer.parseInt(nasci[1]),Integer.parseInt(nasci[2]));
        this.dataAdmissao = new Data(Integer.parseInt(dataAd[0]),Integer.parseInt(dataAd[1]),Integer.parseInt(dataAd[2])) ;
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
