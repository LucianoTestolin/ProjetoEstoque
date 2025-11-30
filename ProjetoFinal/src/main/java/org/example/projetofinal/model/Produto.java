package org.example.projetofinal.model;

public class Produto {

    private String codigo;
    private String nome;
    private Integer quantidade;

    public Produto(String codigo, String nome, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void adicionarUnidades(int valor) {
        this.quantidade += valor;
    }

    public void retirarUnidades(int valor) {
        if (this.quantidade - valor >= 0) {
            this.quantidade -= valor;
        }
    }
}
