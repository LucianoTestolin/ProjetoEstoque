package org.example.projetofinal.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.projetofinal.util.JsonUtil;
import org.example.projetofinal.Main;
import org.example.projetofinal.model.Produto;

public class EstoqueController {



    @FXML private TextField txtCodigo;
    @FXML private TextField txtNome;
    @FXML private TextField txtQuantidade;

    @FXML private TableView<Produto> tabela;
    @FXML private TableColumn<Produto, String> colCodigo;
    @FXML private TableColumn<Produto, String> colNome;
    @FXML private TableColumn<Produto, Integer> colQuantidade;

    public static ObservableList<Produto> lista = JsonUtil.carregar();

    @FXML
    public void initialize() {
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        tabela.setItems(lista);
    }

    @FXML
    private void cadastrar() {
        try {
            String codigo = txtCodigo.getText();
            String nome = txtNome.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());

            lista.add(new Produto(codigo, nome, quantidade));
            JsonUtil.salvar(lista);

            limparCampos();
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida!");
        }


    }

    @FXML
    private void excluir() {
        Produto selecionado = tabela.getSelectionModel().getSelectedItem();

        if (selecionado != null) {
            lista.remove(selecionado);
            JsonUtil.salvar(lista);
        }
    }

    @FXML
    private void adicionarUnidades() {
        Produto selecionado = tabela.getSelectionModel().getSelectedItem();

        if (selecionado != null) {
            try {
                int valor = Integer.parseInt(txtQuantidade.getText());
                selecionado.adicionarUnidades(valor);
                JsonUtil.salvar(lista);
                tabela.refresh();
                limparCampos();
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
            }
        }
    }

    @FXML
    private void abrirGrafico() {
        try {
            Main.trocarTela("Grafico.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void limparCampos() {
        txtCodigo.clear();
        txtNome.clear();
        txtQuantidade.clear();
    }

    @FXML
    private void retirarUnidades() {
        Produto selecionado = tabela.getSelectionModel().getSelectedItem();

        if (selecionado != null) {
            try {
                int valor = Integer.parseInt(txtQuantidade.getText());

                if (valor <= selecionado.getQuantidade()) {
                    selecionado.retirarUnidades(valor);
                    JsonUtil.salvar(lista);
                    tabela.refresh();
                    limparCampos();
                } else {
                    System.out.println("Erro: estoque insuficiente!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
            }
        }
    }

}
