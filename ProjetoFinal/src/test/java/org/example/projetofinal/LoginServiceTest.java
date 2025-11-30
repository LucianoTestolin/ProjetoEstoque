package org.example.projetofinal;

import org.example.projetofinal.service.LoginService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginServiceTest {

    @Test
    void permitirLogin() {
        boolean resultado = LoginService.validarLogin("admin", "123");
        assertTrue(resultado);
    }

    @Test
    void bloquearLogin() {
        boolean resultado = LoginService.validarLogin("admin", "errado");
        assertFalse(resultado);
    }
}
