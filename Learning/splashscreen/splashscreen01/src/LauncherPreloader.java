import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LauncherPreloader extends Preloader {

    private Stage preloaderStage;

    @Override
    public void start(Stage arg0) throws Exception {
        try {
            this.preloaderStage = arg0;
            Parent root = FXMLLoader.load(getClass().getResource("./fxml/initPreloader.fxml"));
            Scene scene = new Scene(root);
            arg0.setScene(scene);
            arg0.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void handleStateChangeNotification(StateChangeNotification info){
        if(info.getType() == StateChangeNotification.Type.BEFORE_START){
            preloaderStage.hide();

        }
    }

}
