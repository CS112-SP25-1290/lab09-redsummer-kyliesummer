package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {
    @FXML
    private Button startButton;
    @FXML
    private Button quitButton;

    @FXML
    protected void onStartButtonClick(ActionEvent actionEvent) throws IOException {
        //get map view as a scene
        Parent mapView = FXMLLoader.load(RedSummer.class.getResource("map-view.fxml"));
        Scene mapViewScene = new Scene(mapView);

        //get stage
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        //set scene(change) for our stage
        window.setScene(mapViewScene);

        //show the stage
        window.show();
    }

    @FXML
    protected void onQuitButtonClick() {
        Platform.exit();
    }


}