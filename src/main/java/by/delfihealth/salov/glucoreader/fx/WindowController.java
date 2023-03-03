package by.delfihealth.salov.glucoreader.fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class WindowController implements Initializable {

      @FXML
      private StackPane root;

      @FXML
      private WebView webView;


      private String link = getClass().getResource(
            "/ui/index.html"
      ).toExternalForm();

      private WebEngine engine;

      @Override
      public void initialize(URL location, ResourceBundle resources) {
/*            engine = webView.getEngine();
            engine.setJavaScriptEnabled(true);
            engine.load(link);*/
      }
}