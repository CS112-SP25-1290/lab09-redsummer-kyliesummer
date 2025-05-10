package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.image.Image;




public class CityController {

    //non FXML Stuff
    private RevisedHistoricalEvent redSummerEvent;


    protected void initData(RevisedHistoricalEvent historicalEvent) {
        this.redSummerEvent = historicalEvent;

        locationLabel.setText(this.redSummerEvent.getLocation());
        dateLabel.setText(this.redSummerEvent.getEventDay().toString());
        descriptionLabel.setText(this.redSummerEvent.getDescription());
        revisedDescriptionLabel.setText(this.redSummerEvent.getRevisedDescription());

    }

    //FXML Stuff
    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label revisedDescriptionLabel;
    @FXML
    private ImageView cityImageView;



    @FXML
    protected void onCloseButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

}
