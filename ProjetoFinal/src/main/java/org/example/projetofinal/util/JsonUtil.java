package org.example.projetofinal.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.projetofinal.model.Produto;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {

    private static final String ARQUIVO = "estoque.json";

    public static void salvar(ObservableList<Produto> lista) {
        try (FileWriter writer = new FileWriter(ARQUIVO)) {
            Gson gson = new Gson();
            gson.toJson(lista, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ObservableList<Produto> carregar() {
        try (FileReader reader = new FileReader(ARQUIVO)) {
            Gson gson = new Gson();
            Type tipoLista = new TypeToken<List<Produto>>(){}.getType();
            List<Produto> lista = gson.fromJson(reader, tipoLista);
            return FXCollections.observableArrayList(lista);
        } catch (Exception e) {
            return FXCollections.observableArrayList();
        }
    }
}