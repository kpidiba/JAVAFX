package controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Fruit;

public class ItemController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private ImageView img;

    private Fruit fruit;

    public void setData(Fruit fruit){
        this.fruit = fruit;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(String.valueOf(fruit.getPrice()));
        img.setImage(new Image(getClass().getResourceAsStream(fruit.getImgSrc())));
    }
}
