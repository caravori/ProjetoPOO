package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class GuiCadastroCliente {

    public TextField cpf;
    public TextField CliNome;
    public TextField CliNascimento;
    public TextField Endereco;
    public TextField Renda;
    public TextField Dependente;

    public void BtnCadCliente(ActionEvent actionEvent) {
        try{
            Cliente client = new Cliente(CliNome.getText(),CliNascimento.getText(),cpf.getText(),Endereco.getText(),Dependente.getText(),Double.parseDouble(Renda.getText()));
            client.inserirCliente();
            CliNome.setText(null); CliNascimento.setText(null); cpf.setText(null); Endereco.setText(null); Dependente.setText(null); Renda.setText(null);
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }

    }
}
