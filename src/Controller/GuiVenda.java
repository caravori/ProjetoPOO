package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class GuiVenda {

    public TextField localtime;
    public LocalTime time = LocalTime.now();
    public TextField data;
    public LocalDate date = LocalDate.now();
    public ComboBox ComboVeiculo;
    public ComboBox ComboVendedor;
    public ComboBox ComboCliente;

    public void setTime(ActionEvent actionEvent) {
        localtime.setText(String.valueOf(time));
        data.setText(date.toString());
    }


    public void Load(ActionEvent actionEvent) throws IOException {
        Venda novaVenda = new Venda();
        ObservableList<String> veiculos = FXCollections.observableArrayList();
        ObservableList<String> ven = FXCollections.observableArrayList();
        ObservableList<String> cli = FXCollections.observableArrayList();
        novaVenda.getArrayMoto();
        novaVenda.getArrayCarro();
        novaVenda.getArrayVendedor();
        novaVenda.getArrayCliente();
        int i;
        for(i=0;i<novaVenda.motosComboBox.size();i++){
            veiculos.add(novaVenda.motosComboBox.get(i).getModelo());

        }
        for(i=0;i<novaVenda.carrosComboBox.size();i++){
            veiculos.add(novaVenda.carrosComboBox.get(i).getModelo());
        }
        for(i=0;i<novaVenda.vendedorComboBox.size();i++){
            ven.add(novaVenda.vendedorComboBox.get(i).getNome());
        }
        for(i=0;i<novaVenda.clientesComboBox.size();i++){
            cli.add(novaVenda.clientesComboBox.get(i).getNome());
        }
        ComboVeiculo.setItems(veiculos);
        ComboVendedor.setItems(ven);
        ComboCliente.setItems(cli);

    }

    public void Vender(ActionEvent actionEvent) {

    }
}
