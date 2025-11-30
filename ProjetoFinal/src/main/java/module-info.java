module org.example.projetofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires com.google.gson;


    opens org.example.projetofinal to javafx.fxml;
    exports org.example.projetofinal;
    exports org.example.projetofinal.controller;
    opens org.example.projetofinal.controller to javafx.fxml;
    exports org.example.projetofinal.model;
    opens org.example.projetofinal.model to javafx.fxml;
    exports org.example.projetofinal.util;
    opens org.example.projetofinal.util to javafx.fxml;
    exports org.example.projetofinal.service;
    opens org.example.projetofinal.service to javafx.fxml;
}