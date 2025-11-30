package org.example.projetofinal;

public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;

    @FXML
    private void entrar() {
        try {
            Main.trocarTela("estoque.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
