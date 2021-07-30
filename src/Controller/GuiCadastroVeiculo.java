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
        }catch (NumberFormatException | IOException e){
            JOptionPane.showMessageDialog(null,"Formato inválido!");
        }
    }
}
