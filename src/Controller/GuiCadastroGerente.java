package Controller;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;

public class GuiCadastroGerente {

    public TextField rg;
    public TextField nome;
    public TextField nascimento;
    public TextField admissao;
    public TextField salario;
    public TextField exp;

    public void Cadastrar(MouseEvent mouseEvent) {

        try{
            double sal = Double.parseDouble(salario.getText());
            Gerente gerent = new Gerente(rg.getText(),nome.getText(),nascimento.getText(),admissao.getText(),Double.parseDouble(salario.getText()),Integer.parseInt(exp.getText()));
            gerent.inserirGerente();
            rg.setText(null); nome.setText(null); nascimento.setText(null); admissao.setText(null); salario.setText(null); exp.setText(null);
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }


    }
}
