package org.example.projetofinal.service;

public class LoginService {

    private static final String USUARIO = "admin";
    private static final String SENHA = "123";

    public static boolean validarLogin(String usuario, String senha) {
        return usuario.equals(USUARIO) && senha.equals(SENHA);
    }
}
