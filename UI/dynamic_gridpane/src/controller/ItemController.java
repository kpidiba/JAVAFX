package controller;import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Fruit;
import model.MyListener;

public class ItemController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private ImageView img;

    @FXML
    public void click(MouseEvent actionEvent) {
        myListener.onClickListener(fruit);
    }

    private Fruit fruit;

    private MyListener myListener;

    public void setData(Fruit fruit, MyListener myListener) {
        this.fruit = fruit;
        this.myListener = myListener;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(String.valueOf(fruit.getPrice()));
        img.setImage(new Image(getClass().getResourceAsStream(fruit.getImgSrc())));
    }
}
