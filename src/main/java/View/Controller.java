package View;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import Controller.GlobalFlag;
import Controller.Venda;
import javax.swing.*;
import java.io.IOException;
import Controller.GuiVenda;


public class Controller extends Main{

    public void BtFunc(ActionEvent actionEvent) throws Exception{
        if(GlobalFlag.isGerente()) {
            Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroFuncionario.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Cadastro Funcionario");
            Scene scene1 = new Scene(root1);
            scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene1);
            stage.show();
        }
        else {
            JOptionPane.showMessageDialog(null,"Somente um gerente pode adicionar um novo funcionário!");
        }
    }


    public void BtVei(ActionEvent actionEvent) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroVeiculo.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Cadastro Veículo");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }


    public void BtNvGen(ActionEvent actionEvent) throws Exception{
        if(GlobalFlag.isGerente()) {
            Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroGerente.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Cadastro Gerente");
            Scene scene1 = new Scene(root1);
            scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene1);
            stage.show();
        }
        else {
            JOptionPane.showMessageDialog(null,"Somente um gerente pode adicionar um novo Gerente!");
        }
    }

    public void BtnvF(ActionEvent actionEvent) throws Exception{
        if(GlobalFlag.isGerente()) {
            Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroFuncionario.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Cadastro Funcionario");
            Scene scene1 = new Scene(root1);
            scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene1);
            stage.show();
        }
        else{
            JOptionPane.showMessageDialog(null,"Somente um gerente pode adicionar um novo funcionário!");
        }
    }

    public void BtSave(ActionEvent actionEvent) {
    }

    public void BtNVCli(ActionEvent actionEvent) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroCliente.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Cadastro Funcionario");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }

    public void Btcompra(ActionEvent actionEvent) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("guiVenda.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Cadastro Funcionario");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();

    }

    public void CredPop(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"Criadores: \n\tArthur Borsonaro Uezu\n\tGabriel Zancheta Scavazini\n\tJoão Inácio de Oliveira Ito Porto\n\tVictória Bechara\n Agradecimentos: \nMatheus Lindo e Camila perfeita <3\n ps:Google obrigado pelos icons!");
    }
}
