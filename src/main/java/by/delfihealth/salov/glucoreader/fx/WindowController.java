package by.delfihealth.salov.glucoreader.fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

@Component
public class WindowController implements Initializable {

      @FXML
      private BorderPane root;

      @FXML
      private WebView webView;


      private String link = getClass().getResource(
            "/ui/build/index.html"
      ).toExternalForm();

      private WebEngine engine;

      @Override
      public void initialize(URL location, ResourceBundle resources) {
            root.setOpacity(0);
            webView.setBlendMode(BlendMode.DARKEN);
            webView.setContextMenuEnabled(false);
            engine = webView.getEngine();
            engine.setJavaScriptEnabled(true);
            engine.load(link);

            double startOpacity = 0;
            for (int i = 0; i < 100000; i++) {
                  startOpacity += 0.0001;
                  root.setOpacity(startOpacity);
            }
      }
}
