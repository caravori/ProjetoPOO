package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class GuiLogin {
    public TextField user;
    public TextField pass;

    public void Logar(ActionEvent actionEvent) throws Exception{
        int auth =1; //= login(user.getText(),pass.getText());
        if(auth==0){
            JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos!");
        }
        else{
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
}
