package by.delfihealth.salov.glucoreader;

import by.delfihealth.salov.glucoreader.fx.WindowController;
import ch.micheljung.fxwindow.FxStage;
import ch.micheljung.waitomo.WaitomoTheme;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.fxml.FXMLLoader;
import javafx.print.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * SpringBoot with JavaFX UI
 */
@SpringBootApplication
public class GlucoReaderApplication extends Application {

      //SpringContext
      private ConfigurableApplicationContext configurableApplicationContext;

      private Stage primaryStage;

      private Scene scene;

      private BorderPane root;

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
            root = FXMLLoader.load(getClass().getResource("/fxml/window.fxml"));
            String windowCss = getClass().getResource("/fxml/window.css").toExternalForm();
            Image titleImage = new Image("/png/erythrocytes.png");

            FxStage.configure(primaryStage)
                  .withContent(root)
                  .apply();

            scene = primaryStage.getScene();

            WaitomoTheme.apply(scene);

            scene.getStylesheets().add(windowCss);

            primaryStage.getIcons().add(titleImage);
            primaryStage.setTitle("Title");

            primaryStage.show();
            TimeUnit.MILLISECONDS.sleep(100);
            primaryStage.setOpacity(1.0);
            this.primaryStage = primaryStage;
      }

      //Stopping app
      @Override
      public void stop() throws Exception {
          /*
            //-----------------------------------------------------------------------
            //Get Html
            WebEngine engine = WindowController.getEngine();
            String html = (String) engine.executeScript("document.documentElement.outerHTML");
            //------------------------------------------------------------------------
            String content = html;
            String path = "src/main/resources/ui/build/for_print.html";

            try {

                  Files.write(Paths.get(path), content.getBytes());

            } catch (IOException e) {
                  e.printStackTrace();
            }
            //------------------------------------------------------------------------
            ObservableList<Node> childrenList = root.getChildren();
            System.out.println(childrenList);
            Node node = childrenList.get(1);
            System.out.println(node);
            node.setOpacity(0.0);
            //------------------------------------------------------------------------
            Printer myPrinter = null;
            ObservableSet<Printer> printers = Printer.getAllPrinters();
            for(Printer printer : printers){
                  if(printer.getName().matches("Microsoft Print to PDF")){
                        myPrinter = printer;
                  }
            }
            if (myPrinter != null) {
                  System.out.println("To Printer!");
                  PrinterJob job = PrinterJob.createPrinterJob(myPrinter);
                  // Scale image to full page

                  final Printer printer = job.getPrinter();
                  final Paper paper = job.getJobSettings().getPageLayout().getPaper();
                  final PageLayout pageLayout = printer.createPageLayout(paper,
                        PageOrientation.LANDSCAPE, Printer.MarginType.HARDWARE_MINIMUM);
                  final double scaleX = pageLayout.getPrintableWidth() / root.getWidth();
                  final double scaleY = pageLayout.getPrintableHeight() / root.getHeight();
                  final Scale scale = new Scale(scaleX, scaleY);
                  root.getTransforms().add(scale);

                  if (job != null) {
                        job.getJobSettings().setPageLayout(pageLayout);
*//*                        job.showPrintDialog(primaryStage);*//*
                        boolean success = job.printPage(root);
                        success = job.printPage(root);
                        if (success) {
                              System.out.println("Done printing!");
                              job.endJob();
                              root.getTransforms().remove(scale);
                        }
                  }
            }
            */
            //------------------------------------------------------------------------
            //Stop spring boot application
            configurableApplicationContext.close();
      }

      //Entry point in app and start JavaFx
      public static void main(String[] args) {
            Application.launch(args);
      }
}
