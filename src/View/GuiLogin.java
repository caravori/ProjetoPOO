package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javax.swing.*;
import Controller.GlobalFlag;

import java.util.Optional;

import static Controller.Entrar.addLogin;
import static Controller.Entrar.login;

public class GuiLogin {
    public TextField user;
    public PasswordField pass;

    public void Logar(ActionEvent actionEvent) throws Exception{
        int auth = login(user.getText(),pass.getText());
        if(auth==0){
            JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos!");
        }
        else if(auth == 1){
            GlobalFlag.setGerente(false);
            ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
            Parent root1 = FXMLLoader.load(getClass().getResource("guiMain.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Cadastro Funcionario");
            Scene scene1 = new Scene(root1);
            scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene1);
            stage.show();
        }
        else{
            GlobalFlag.setGerente(true);
            ((Stage)(((Button)actionEvent.getSource()).getScene().getWindow())).close();
            Parent root1 = FXMLLoader.load(getClass().getResource("guiMain.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Cadastro Funcionario");
            Scene scene1 = new Scene(root1);
            scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene1);
            stage.show();
        }
    }

    public void cadastrar(ActionEvent actionEvent) {
        String tipo = null;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Tipo funcionario");
        alert.setHeaderText("Qual o tipo de funcionário?");
        alert.setContentText("Escolha:");

        ButtonType buttonTypeTwo = new ButtonType("Vendedor");
        ButtonType buttonTypeThree = new ButtonType("Gerente");
        ButtonType buttonTypeCancel = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll( buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == buttonTypeTwo) {
            tipo = "1";
        } else if (result.get() == buttonTypeThree) {
            tipo = "2";
        } else {
        }
        addLogin(user.getText(),pass.getText(),tipo);
        user.setText(null); pass.setText(null);
    }
}
