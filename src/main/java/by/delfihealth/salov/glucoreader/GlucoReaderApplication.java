package by.delfihealth.salov.glucoreader;

import ch.micheljung.fxwindow.FxStage;
import ch.micheljung.waitomo.WaitomoTheme;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.io.IOException;

/**
 * SpringBoot with JavaFX UI
 */
@SpringBootApplication
public class GlucoReaderApplication extends Application {

      //SpringContext
      private ConfigurableApplicationContext configurableApplicationContext;

      //Fxml resources
      private StackPane root;
      private String windowCss;
      private  Image titleImage;


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
            root = FXMLLoader.load(getClass().getResource("/fxml/window.fxml"));
            windowCss = getClass().getResource("/fxml/window.css").toExternalForm();
            titleImage = new Image("/png/erythrocytes.png");

      }

      //Set window stage settings and show it
      @Override
      public void start(Stage primaryStage) throws Exception {

            FxStage.configure(primaryStage)
                  .withContent(root)
                  .apply();

            Scene scene = primaryStage.getScene();

            WaitomoTheme.apply(scene);

            scene.getStylesheets().add(windowCss);

            primaryStage.getIcons().add(titleImage);
            primaryStage.setTitle("Title");
            primaryStage.show();
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
