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

/*
 * This class is a controller for the splash screen. It initializes the
 * progress bar and creates a new thread that updates the progress bar
 * and then loads the main application. The main application is loaded
 * after the progress bar reaches 100%.
 *
 * @author kbrightcoder
 */
public class SplashController implements Initializable {
    /*
     * The AnchorPane that is the root of the splash screen.
     */
    @FXML
    private AnchorPane panelId;

    /*
     * The ProgressBar that is used to display the progress of the splash
     * screen.
     */
    @FXML
    private ProgressBar progressId;

    /*
     * The progress of the splash screen. This is updated by the SplashScreen
     * thread and then used to update the progress bar.
     */
    private double progress = 0;

    /*
     * Initialize the progress bar and start the SplashScreen thread.
     *
     * @param arg0 The location of the FXML file.
     * @param arg1 The resources used by the FXML file.
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        new SplashScreen().start();
    }

    /*
     * This class is a thread that updates the progress bar and then loads
     * the main application.
     */
    class SplashScreen extends Thread {

        /*
         * Update the progress bar and load the main application if the progress
         * reaches 100%.
         */
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
                /*
                 * Load the main application and hide the splash screen.
                 */
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

