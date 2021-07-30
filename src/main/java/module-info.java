module TestJFX {

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    opens View;
    opens Controller;
    opens arquivos;

}