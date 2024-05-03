import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * App
 */
public class App  extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        StackPane root = new StackPane();
        Text text = new Text("Hello, I am Nayan!");
        text.setFont(Font.font("Arial",12));
        text.setTranslateX(text.getTranslateX() + 100);

        root.getChildren().add(text);

        Scene scene = new Scene(root ,320,200);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args){
        launch(args);
    }

    
}