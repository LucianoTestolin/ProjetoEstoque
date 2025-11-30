package org.example.projetofinal;

import org.example.projetofinal.model.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveAdicionarUnidadesAoProduto() {
        Produto p = new Produto("001", "Teclado", 10);

        p.adicionarUnidades(5);

        assertEquals(15, p.getQuantidade());
    }

    @Test
    void deveRetirarUnidadesDoProduto() {
        Produto p = new Produto("002", "Mouse", 10);

        p.retirarUnidades(3);

        assertEquals(7, p.getQuantidade());
    }
}