package by.delfihealth.salov.glucoreader.fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class IndexController implements Initializable {

      @FXML
      private WebView indexWebView;

      private String link = getClass().getResource(
            "/static/index.html"
      ).toExternalForm();

      private WebEngine engine;

      @Override
      public void initialize(URL location, ResourceBundle resources) {
            engine = indexWebView.getEngine();
            engine.setJavaScriptEnabled(true);
            engine.load(link);
      }
}
