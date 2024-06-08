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
import model.MyListener;

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

    private MyListener myListener;

    private List<Fruit> getFruits() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;
        
        //NOTE: KIWI
        fruit = new Fruit();
        fruit.setName("Mange");
        fruit.setPrice(2.99);
        fruit.setColor("6A7324");
        fruit.setImgSrc("../images/kiwi.png");
        fruits.add(fruit);

        //NOTE: COCONUT
        fruit = new Fruit();
        fruit.setName("Coconut");
        fruit.setPrice(3.5);
        fruit.setColor("A7745B");
        fruit.setImgSrc("../images/coconut.png");
        fruits.add(fruit);

        //NOTE: PEACH
        fruit = new Fruit();
        fruit.setName("Peach");
        fruit.setPrice(1.99);
        fruit.setColor("F16C31");
        fruit.setImgSrc("../images/peach.png");
        fruits.add(fruit);

        //NOTE: GRAPES
        fruit = new Fruit();
        fruit.setName("Grapes");
        fruit.setPrice(0.99);
        fruit.setColor("291D36");
        fruit.setImgSrc("../images/grapes.png");
        fruits.add(fruit);

        //NOTE: WATERMELON
        fruit = new Fruit();
        fruit.setName("Water Melon");
        fruit.setPrice(2.99);
        fruit.setColor("23371D");
        fruit.setImgSrc("../images/watermelon.png");
        fruits.add(fruit);

        //NOTE: ORANGE
        fruit = new Fruit();
        fruit.setName("Orane");
        fruit.setPrice(4.50);
        fruit.setColor("FB5D03");
        fruit.setImgSrc("../images/orange.png");
        fruits.add(fruit);

        //NOTE: STRAWBERRY
        fruit = new Fruit();
        fruit.setName("StrawBerry");
        fruit.setPrice(0.99);
        fruit.setColor("80080C");
        fruit.setImgSrc("../images/strawberry.png");
        fruits.add(fruit);

        //NOTE:MANGO
        fruit = new Fruit();
        fruit.setName("Mango");
        fruit.setPrice(2.99);
        fruit.setColor("FFB605");
        fruit.setImgSrc("../images/mango.png");
        fruits.add(fruit);

        //NOTE: CHERRY
        fruit = new Fruit();
        fruit.setName("Cherry");
        fruit.setPrice(2.45);
        fruit.setColor("5F060E");
        fruit.setImgSrc("../images/cherry.png");
        fruits.add(fruit);

        //NOTE: BANANA
        fruit = new Fruit();
        fruit.setName("Banana");
        fruit.setPrice(2.99);
        fruit.setColor("E7C00f");
        fruit.setImgSrc("../images/banana.png");
        fruits.add(fruit);
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
        choosenFruit(fruits.get(0));
        myListener = new MyListener() {
            @Override
            public void onClickListener(Fruit fruit){
                choosenFruit(fruit);
            }
        };
        int column = 0;
        int row = 1;
        try {
            for (Fruit fruit : fruits) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("../fxml/item/item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setData(fruit,myListener);
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
