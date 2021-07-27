package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class GuiCadastroFuncionario extends Stage {
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
