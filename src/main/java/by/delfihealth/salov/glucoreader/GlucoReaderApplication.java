package by.delfihealth.salov.glucoreader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.springframework.beans.factory.annotation.Autowired;
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

      //JavaFx window root
      private Parent windowRoot;

      //Initialize spring, load resources before start, and run window root
      @Override
      public void init() throws Exception {
            //Run Spring context
            configurableApplicationContext = SpringApplication.run(GlucoReaderApplication.class);

            //Get fxml
            FXMLLoader windowFXML = new FXMLLoader(
                  getClass().getResource("/fxml/index.fxml")
            );

            //load JavaFX controllers which load like beans from context
            windowFXML.setControllerFactory(configurableApplicationContext::getBean);

            //Run window root in new thread
            Platform.runLater(new Runnable() {
                  @Override
                  public void run() {
                        try {
                              windowRoot = windowFXML.load();
                        } catch (IOException e) {
                              throw new RuntimeException(e);
                        }
                  }
            });
      }

      //Set window stage settings and show it
      @Override
      public void start(Stage primaryStage) throws Exception {

            primaryStage.setTitle("GlucoReader");
            primaryStage.setScene(
                  new Scene(windowRoot, 600, 400)
            );
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
