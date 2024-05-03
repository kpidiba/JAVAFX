package controllers;

import java.sql.Connection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import util.DatabaseConnection;
import java.lang.Thread;

public class LoginController {

    @FXML
    private Button connexionButton;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    void onClickConnexion(ActionEvent event) {
        if (usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("NOTIFICATION");
            alert.setContentText("Veuillez Entrez les informations");
            alert.show();
        } else {
            connexionButton.setDisable(true);
            connexionButton.setText("");
            Thread t = new Thread(() -> {
                valideLogin();
                connexionButton.setDisable(false);
            });
            t.start();
            ProgressIndicator indicator = new ProgressIndicator();
            indicator.setPrefSize(40,40);
            connexionButton.setGraphic(indicator);
            // indicator.progressProperty().bind(10);
        }
    }

    private void valideLogin() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connectionDB = databaseConnection.getConnection();

        // connectionDB.
        String verifyLogin = "SELECT count(1) FROM user where username = '" + usernameTextField.getText()
                + "' AND password = '" + passwordTextField.getText() + "'";
        connectionDB = databaseConnection.getConnection();

        try {
            java.sql.Statement statement = connectionDB.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(verifyLogin);
            if (resultSet.next()) {
                if (resultSet.getInt(1) == 1) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("NOTIFICATION");
                    alert.setContentText("Connexion reussie");
                    alert.show();
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("NOTIFICATION");
                    alert.setContentText("Connexion echoue");
                    alert.show();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
