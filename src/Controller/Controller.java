package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    public void BtFunc(ActionEvent actionEvent) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("../View/guiCadastroFuncionario.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Cadastro Funcionario");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("../View/style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }
}
