package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import model.Fruit;

public class AppController implements Initializable {
    @FXML
    private VBox chosenFruitCard;

    @FXML
    private ImageView fruitImg;

    @FXML
    private Label fruitNameLabel;

    @FXML
    private Label fruitPriceLabel;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

    private List<Fruit> fruits = new ArrayList<>();

    private List<Fruit> getFruits() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;
        for (int i = 0; i < 20; i++) {
            fruit = new Fruit();
            fruit.setName("Mange");
            fruit.setPrice(2.99);
            fruit.setColor("6A7324");
            fruit.setImgSrc("../images/kiwi.png");
            fruits.add(fruit);
        }
        return fruits;
    }

    public void choosenFruit(Fruit fruit) {
        fruitNameLabel.setText(fruit.getName());
        fruitPriceLabel.setText(String.valueOf(fruit.getPrice()));
        fruitImg.setImage(new Image(getClass().getResourceAsStream(fruit.getImgSrc())));
        chosenFruitCard.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" + " -fx-background-radius:30; ");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        fruits.addAll(getFruits());
        if (!fruits.isEmpty()) {
            choosenFruit(fruits.get(0));
        }
        int column = 0;
        int row = 1;
        try {

            for (Fruit fruit : fruits) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../fxml/item/item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setData(fruit);
                grid.add(anchorPane, column, row);
                if (++column == 2) {
                    column = 0;
                    row++;
                }
                // set grid with
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_COMPUTED_SIZE);

                // set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_COMPUTED_SIZE);
                GridPane.setMargin(anchorPane, new Insets(10));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
