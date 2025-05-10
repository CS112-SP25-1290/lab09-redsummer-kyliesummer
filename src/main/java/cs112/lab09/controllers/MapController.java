package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import cs112.lab09.models.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {

    //NOTE: reedunance in methods

    private void openPopupWindow(RevisedHistoricalEvent rhEvent) throws IOException {
        //get FMXL file for popup window (city-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RedSummer.class.getResource("city-view.fxml"));
        Parent cityViewParent = loader.load();

        //pass data to controller for that view
        CityController cityController = loader.getController();
        cityController.initData(rhEvent);

        //create a new stage for my popup window
        Stage popupStage = new Stage();

        //extra step: change modality of window (locking the back window)
        popupStage.initModality(Modality.APPLICATION_MODAL);

        //set scene
        popupStage.setScene(new Scene(cityViewParent));

        //show scene
        popupStage.show();
    }


    @FXML
    protected void onSanFranciscoButtonClick () throws IOException {
        RevisedHistoricalEvent sfEvent = new RevisedHistoricalEvent(
                "sanfrancisco.jpg",
                "San Francisco, CA",
                "A minor riot between Black and white soldiers occured in the Presido in San Francisco",
                new Date(5, 15, 1919),
                "A minor riot between Black and white soldiers occured in the Presido in San Francisco after a dispute about a Thai soldier who was moved from the \"colored quarters\" to the white military housing. Despite defending our country, housing for Black soldiers was not only segregated but often inferior. BLack soldiers also faced increased attacks and other forms of discrimination upon returning home.",
                "http://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en");

        this.openPopupWindow(sfEvent);

    }

    @FXML
    protected void onBisbeeButtonClick() throws IOException {
        RevisedHistoricalEvent bisbeeEvent = new RevisedHistoricalEvent(
                "bisbee.png",
                "Bisbee, Arizona",
                "Local police in Bisbee, Arizona attacked the 10th U.S. Cavalry, an African-American unit known as the \"Buffalo Soldiers,\" formed in 1866.",
                new Date(7, 13, 1919),
                "Although sources are limited, the attack occured on the eve of celebrations meant to honor returning soldiers (like in Norfolk, Virginia)",
                "http://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en");


        this.openPopupWindow(bisbeeEvent);
    }
}
