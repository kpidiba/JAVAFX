package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SplashController implements Initializable {
    @FXML
    private AnchorPane panelId;

    @FXML
    private ProgressBar progressId;

    private double progress = 0;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        new SplashScreen().start();
    }

    class SplashScreen extends Thread {

        @Override
        public void run() {
            for (progress = 0.0; progress < 1.01; progress += 0.01) {
                Platform.runLater(() -> progressId.setProgress(progress));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        panelId.getScene().getWindow().hide();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}

