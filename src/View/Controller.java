package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Controller.GlobalFlag;

import javax.swing.*;


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
}
