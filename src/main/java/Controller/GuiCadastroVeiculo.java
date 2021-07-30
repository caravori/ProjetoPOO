package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class GuiCadastroVeiculo {

    public TextField chassi;
    public TextField marca;
    public TextField modelo;
    public TextField ano;
    public TextField km;
    public TextField combust;
    public TextField peso;
    public TextField pot;
    public TextField cilindrada;
    public TextField ocupantes;
    public TextField tipo;
    public TextField dimencoes;
    public CheckBox vendido;
    public Button cadastro;

    public TextField mchassi;
    public TextField mmarca;
    public TextField mmodelo;
    public TextField mano;
    public TextField mkm;
    public TextField mcombus;
    public TextField mpeso;
    public TextField mcilindrada;
    public TextField mtipo;
    public CheckBox mvendido;
    public Button mcadastro;

    public String vendidos;

    public void cadastra(ActionEvent actionEvent) {
        //Carro(int nChassi, String marca, String modelo, int ano, int km, String tCombustivel, double peso, String status, String tipo,int pot,int cilindradas, int nOc, String dim)
        try{
            if(vendido.isSelected()){
                vendidos = "Vendido";
            }
            else{
                vendidos = "Não vendido";
            }
            Carro car = new Carro(Integer.parseInt(chassi.getText()),marca.getText(),modelo.getText(),Integer.parseInt(ano.getText()), Integer.parseInt(km.getText()),combust.getText(),Double.parseDouble(peso.getText()),vendidos,tipo.getText(),Integer.parseInt(pot.getText()),Integer.parseInt(cilindrada.getText()),Integer.parseInt(cilindrada.getText()),dimencoes.getText() );
            car.inserirCarro();
            chassi.setText(null);marca.setText(null);modelo.setText(null);ano.setText(null);km.setText(null);combust.setText(null);peso.setText(null);tipo.setText(null);pot.setText(null);cilindrada.setText(null);dimencoes.setText(null);
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }
    }


    public void cadastromoto(ActionEvent actionEvent) {
        try {
            if(mvendido.isSelected()){
                vendidos = "Vendido";
            }
            else {
                vendidos = "Não Vendido";
            }
            Moto novaMoto = new Moto(Integer.parseInt(mchassi.getText()), mmarca.getText(),  mmodelo.getText(), Integer.parseInt(mano.getText()), Integer.parseInt(mkm.getText()), mcombus.getText(),Double.parseDouble(mpeso.getText()), vendidos,Integer.parseInt(mcilindrada.getText()),mtipo.getText());
            novaMoto.inserirMoto();
            mchassi.setText(null);mmarca.setText(null);mmodelo.setText(null);mano.setText(null);mkm.setText(null);mcombus.setText(null);mpeso.setText(null);mcilindrada.setText(null);mtipo.setText(null);
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }
    }
}
