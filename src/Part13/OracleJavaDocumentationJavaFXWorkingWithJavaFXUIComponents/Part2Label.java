package Part13.OracleJavaDocumentationJavaFXWorkingWithJavaFXUIComponents;
// https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/label.htm#CIHHFIBJ
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Part2Label extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Empty Label
        Label label1 = new Label();
        // Label with text element
        Label label2 = new Label("Search");
        // Label with text element and graphical icon
        Image image = new Image(new FileInputStream("search-icon.jpg"));
        Label label3 = new Label("Search", new ImageView(image));
        // Label with text element and graphical icon using setters
        Label label4 = new Label();
        label4.setText("Search");
        label4.setGraphic(new ImageView(image));
        label4.setTextFill(Color.web("#0076a3"));
        label4.setGraphicTextGap(50);

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label1);
        flowPane.getChildren().add(label2);
        flowPane.getChildren().add(label3);
        flowPane.getChildren().add(label4);


        Scene scene = new Scene(flowPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
