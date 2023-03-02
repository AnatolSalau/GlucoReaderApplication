package by.delfihealth.salov.glucoreader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javafx.stage.StageStyle;
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

/*      private double xOffset = 0;
      private double yOffset = 0;*/

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



            //primaryStage.initStyle(StageStyle.TRANSPARENT);
            //stage.initStyle(StageStyle.UNDERDECORATED);
/*
            //grab your root here
            windowRoot.setOnMousePressed(new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent event) {
                        xOffset = event.getSceneX();
                        yOffset = event.getSceneY();
                  }
            });

            //move around here
            windowRoot.setOnMouseDragged(new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent event) {
                        primaryStage.setX(event.getScreenX() - xOffset);
                        primaryStage.setY(event.getScreenY() - yOffset);
                  }
            });*/

            primaryStage.setTitle("GlucoReader");

            primaryStage.getIcons().add(new Image("/png/erythrocytes.png"));

            /*Show the location of the CSS resource file*/
            String css = this.getClass().getResource("/fxml/index.css").toExternalForm();
            Scene scene = new Scene(windowRoot, 600, 400);
            scene.getStylesheets().add(css);
            primaryStage.setScene(scene);
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
