package com.example.prueba;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private ImageView ivPersona;
    private ImageView ivLibro;
    private GridPane userDataPane;
    private GridPane bookDataPane;

    @FXML
    protected void onIvPersonaClick() {
        bookDataPane.setVisible(true);
    }
}