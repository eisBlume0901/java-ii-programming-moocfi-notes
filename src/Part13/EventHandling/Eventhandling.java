package Part13.EventHandling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Eventhandling extends Application {
/*
Event handlers - attached to user interface components
are always connected to perform on a user interface
components.

Whenever an action is performed on a user interface component,
each of the event handlers attached will be executed.

Purpose of event handler: To change the state of some object
through referencing the object we wanted to.
 */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("This is a button");

        // Version 1
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Pressed!");
//            }
//        });

        // Version 2
        button.setOnAction((actionEvent -> System.out.println("Pressed!")));

        FlowPane layout = new FlowPane();
        layout.getChildren().add(button);

        Scene view = new Scene(layout);

        primaryStage.setScene(view);
        primaryStage.show();
    }
}
