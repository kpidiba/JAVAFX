import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            primaryStage.setTitle("Google Preview");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}