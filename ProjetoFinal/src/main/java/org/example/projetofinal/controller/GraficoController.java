package org.example.projetofinal.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import org.example.projetofinal.Main;
import org.example.projetofinal.model.Produto;

public class GraficoController {

    @FXML
    private BarChart<String, Number> grafico;

    @FXML
    public void initialize() {

        XYChart.Series<String, Number> serie = new XYChart.Series<>();

        for (Produto p : EstoqueController.lista) {
            serie.getData().add(
                    new XYChart.Data<>(p.getNome(), p.getQuantidade())
            );
        }

        grafico.getData().clear();
        grafico.getData().add(serie);
    }

    @FXML
    private void voltar() {
        try {
            Main.trocarTela("Estoque.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
