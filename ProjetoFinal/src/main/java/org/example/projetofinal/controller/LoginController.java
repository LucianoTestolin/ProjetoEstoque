package org.example.projetofinal.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.projetofinal.Main;

public class LoginController {


    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;

    private final String USUARIO_PADRAO = "admin";
    private final String SENHA_PADRAO = "123";

    @FXML
    private void entrar() {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        if (usuario.equals(USUARIO_PADRAO) && senha.equals(SENHA_PADRAO)) {
            try {
                Main.trocarTela("Estoque.fxml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de Login");
            alert.setHeaderText(null);
            alert.setContentText("Usuário ou senha inválidos!");
            alert.showAndWait();
        }
    }
}
