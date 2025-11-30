package org.example.projetofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene cena = new Scene(loader.load());

        primaryStage.setTitle("Sistema de Estoque");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void trocarTela(String nomeTela) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(nomeTela));
        Scene cena = new Scene(loader.load());
        stage.setScene(cena);
    }
}
