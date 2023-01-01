package com.example.simpledicegamenetwork10.Controller;

import com.example.simpledicegamenetwork10.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TurnController {

    private Game game = new Game();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}
