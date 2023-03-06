package by.delfihealth.salov.glucoreader.fx;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;
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

      @FXML
      private StackPane pane;

      @FXML
      private StackPane splashScreen;


      private String link = getClass().getResource(
            "/ui/build/index.html"
      ).toExternalForm();

      private WebEngine engine;

      @Override
      public void initialize(URL location, ResourceBundle resources) {
            webView.setBlendMode(BlendMode.DARKEN);
            webView.setContextMenuEnabled(false);
            engine = webView.getEngine();
            engine.setJavaScriptEnabled(true);
            engine.load(link);


            // Create the initial and final key frames
            KeyValue initKeyValue = new KeyValue(root.opacityProperty(), 0.0);
            KeyFrame initFrame = new KeyFrame(Duration.ZERO, initKeyValue);
            KeyValue endKeyValue = new KeyValue(root.opacityProperty(), 1.0);
            KeyFrame endFrame = new KeyFrame(Duration.seconds(2), endKeyValue);
            // Create a Timeline object
            Timeline timeline = new Timeline(initFrame, endFrame);
            // Let the animation run forever
            //timeline.setCycleCount(Timeline.INDEFINITE);
            // Start the animation
            timeline.play();

      }
}
