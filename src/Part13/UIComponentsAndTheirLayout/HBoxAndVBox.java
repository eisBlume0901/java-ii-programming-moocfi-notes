package Part13.UIComponentsAndTheirLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxAndVBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

//        HBox hLayout = new HBox();
//        hLayout.setSpacing(10);
//        hLayout.getChildren().add(new Label("first"));
//        hLayout.getChildren().add(new Label("second"));
//        hLayout.getChildren().add(new Label("third"));
//        Scene view = new Scene(hLayout);
//        primaryStage.setScene(view);
//        primaryStage.show();


        VBox vLayout = new VBox();
        vLayout.setSpacing(10);
        vLayout.getChildren().add(new Label("first"));
        vLayout.getChildren().add(new Label("second"));
        vLayout.getChildren().add(new Label("third"));
        Scene scene = new Scene(vLayout);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
