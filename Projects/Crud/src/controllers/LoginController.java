package controllers;

import com.ultramixer.laddafx.LaddaButton;
import com.ultramixer.laddafx.LaddaButtonStyle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button connexionButton;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    void initialize() {
        LaddaButton button = new LaddaButton();
        button.setText(connexionButton.getText());
        button.setLaddaButtonStyle(LaddaButtonStyle.EXPAND_LEFT);
        connexionButton.getParent().
        connexionButton.getParent().remove(connexionButton);
        connexionButton.getParent().add(button);

        button.setOnAction(this::onClickConnexion);
    }

    @FXML
    void onClickConnexion(ActionEvent event) {
        System.out.println("Hello World!");
    }

}
