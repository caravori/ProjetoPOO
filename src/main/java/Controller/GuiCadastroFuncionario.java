package Controller;

import View.Main;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;


public class GuiCadastroFuncionario extends Main {
    public TextField rg;
    public TextField nome;
    public TextField nascimento;
    public TextField admissao;
    public TextField salario;
    public TextField gerente;
    public TextField tempo;

    public void Cadastrar(MouseEvent mouseEvent) {
        try{
            double sal = Double.parseDouble(salario.getText());
            Vendedor vend = new Vendedor(rg.getText(),nome.getText(),nascimento.getText(),admissao.getText(),Double.parseDouble(salario.getText()),tempo.getText(),gerente.getText());
            vend.inserirVendedor();
            rg.setText(null); nome.setText(null); nascimento.setText(null); admissao.setText(null); salario.setText(null); tempo.setText(null); gerente.setText(null);
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }

    }
}
