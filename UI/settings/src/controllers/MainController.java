package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {
    @FXML
    private AnchorPane settings;

    @FXML
    private ImageView button_setting;

    @FXML
    private AnchorPane profile;

    @FXML
    private AnchorPane topBar;

    @FXML
    private AnchorPane other;


    @FXML
    public void otherButtonClicked(MouseEvent event){
        settings.setVisible(false);
        profile.setVisible(false);
        other.setVisible(true);
    }

    @FXML
    public void onClickProfileButton(MouseEvent event) {
        settings.setVisible(false);
        profile.setVisible(true);
        other.setVisible(false);
    }

    @FXML
    void handleButtonAction(MouseEvent event) {
        settings.setVisible(true);
        profile.setVisible(false);
        other.setVisible(false);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }
}
