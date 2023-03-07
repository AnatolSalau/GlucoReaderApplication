package by.delfihealth.salov.glucoreader;

import ch.micheljung.fxwindow.FxStage;
import ch.micheljung.waitomo.WaitomoTheme;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * SpringBoot with JavaFX UI
 */
@SpringBootApplication
public class GlucoReaderApplication extends Application {

      //SpringContext
      private ConfigurableApplicationContext configurableApplicationContext;

      public GlucoReaderApplication() throws IOException {
      }

      //Initialize spring, load resources before start, and run window root
      @Override
      public void init() throws Exception {
            //Run Spring context
            configurableApplicationContext = SpringApplication.run(GlucoReaderApplication.class);

            //Get fxml
            FXMLLoader windowFXML = new FXMLLoader(
                  getClass().getResource("/fxml/window.fxml")
            );

            //load JavaFX controllers which load like beans from context
            windowFXML.setControllerFactory(configurableApplicationContext::getBean);

            //Load resources


      }

      //Set window stage settings and show it
      @Override
      public void start(Stage primaryStage) throws Exception {
            primaryStage.setOpacity(0.0);

            //Fxml resources
            BorderPane root = FXMLLoader.load(getClass().getResource("/fxml/window.fxml"));
            String windowCss = getClass().getResource("/fxml/window.css").toExternalForm();
            Image titleImage = new Image("/png/erythrocytes.png");

            FxStage.configure(primaryStage)
                  .withContent(root)
                  .apply();

            Scene scene = primaryStage.getScene();

            WaitomoTheme.apply(scene);

            scene.getStylesheets().add(windowCss);

            primaryStage.getIcons().add(titleImage);
            primaryStage.setTitle("Title");

            primaryStage.show();
            TimeUnit.MILLISECONDS.sleep(100);
            primaryStage.setOpacity(1.0);
      }

      //Stopping app
      @Override
      public void stop() throws Exception {
            //Stop spring boot application
            configurableApplicationContext.close();

      }

      //Entry point in app and start JavaFx
      public static void main(String[] args) {
            Application.launch(args);
      }
}
