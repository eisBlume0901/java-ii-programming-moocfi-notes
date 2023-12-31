package Part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestingApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        Button button = new Button("Click Me");
//        TextField textField = new TextField();
//
//        FlowPane flowPane = new FlowPane();
//        flowPane.getChildren().add(button);
//        flowPane.getChildren().add(textField);
//
//        Scene scene = new Scene(flowPane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();

//        BorderPane layout = new BorderPane();
//        layout.setTop(new Label("NORTH"));
//        layout.setRight(new Label("EAST"));
//        layout.setBottom(new Label("SOUTH"));
//
//        Scene scene = new Scene(layout);
//        primaryStage.setScene(scene);
//        primaryStage.show();

        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea(""));


        HBox labelBar = new HBox();
        labelBar.setSpacing(10);

        Label label1 = new Label("Letters: 0");
        Label label2 = new Label("Words: 0");
        Label label3 = new Label("The longest word is: ");

        labelBar.getChildren().add(label1);
        labelBar.getChildren().add(label2);
        labelBar.getChildren().add(label3);

        layout.setBottom(labelBar);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
