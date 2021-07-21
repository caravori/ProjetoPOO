package Controller;

public class Gerente extends Funcionario{

    private int anosExp;

    public Gerente(String rg, String nome, String nascimento, String dataAdmissao, double salario,int anosExp) {
        super(rg, nome, nascimento, dataAdmissao, salario);
        this.anosExp = anosExp;
    }

    public int getAnosExp() {
        return anosExp;
    }
}
