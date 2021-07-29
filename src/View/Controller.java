package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller extends Main{

    public void BtFunc(ActionEvent actionEvent) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("guiCadastroFuncionario.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Cadastro Funcionario");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }

    public void Btsave(ActionEvent actionEvent) {
    }
}
