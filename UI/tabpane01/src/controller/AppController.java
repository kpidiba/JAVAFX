package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AppController implements Initializable {
    @FXML
    private Tab tab1, tab2, tab3;

    private ImageView addGraphic(String imageFile) {
        ImageView view1 = null;
        Image image = new Image(getClass().getResourceAsStream(imageFile));
        view1 = new ImageView(image);
        view1.setFitHeight(15);
        view1.setFitWidth(15);
        return view1;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ImageView view1 = addGraphic("../images/images.png");
        tab1.setGraphic(view1);
    }

}
