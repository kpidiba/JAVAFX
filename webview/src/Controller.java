import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable {

    @FXML
    private WebView webRender;
    private WebEngine e;

    @FXML
    void loading(ActionEvent event) {
        e.load("https://google.com");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        e = webRender.getEngine();
    }

}
