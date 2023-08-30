import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Action implements Initializable {
    @FXML
    private WebView w;
    private WebEngine e;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        e = w.getEngine();  
    }

    @FXML
    public void show(ActionEvent event){
        e.load("http://google.com");
    }

    
}
