package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {
    public Label textoInvisible;
    public Button botao;


    public void switchScene(ActionEvent actionEvent) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("../View/guiCadastro.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Segundo Stage");
        Scene scene1 = new Scene(root1);
        scene1.getStylesheets().add(getClass().getResource("../View/style.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
    }
}
