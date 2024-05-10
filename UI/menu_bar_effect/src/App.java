import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/app.fxml"));
        Scene scene = new Scene(root);
        scene.setFill(null);
        arg0.setTitle("MENU BAR EFFECT");
        arg0.initStyle(StageStyle.UNDECORATED);
        arg0.setScene(scene);
        arg0.show();
    }

}
