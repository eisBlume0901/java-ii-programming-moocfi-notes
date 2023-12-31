package Part13.UIComponentsAndTheirLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleLayoutsOnASingleInterface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First"));
        texts.getChildren().add(new Label("Second"));
        texts.getChildren().add(new Label("Third"));

        layout.setTop(buttons);
        layout.setLeft(texts);
        layout.setCenter(new TextArea(""));

        Scene view = new Scene(layout);
        primaryStage.setScene(view);
        primaryStage.show();
    }
}
