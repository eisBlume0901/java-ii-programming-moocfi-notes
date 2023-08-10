package Part13.GraphicalUserInterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class JavaFxApplication extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Lesson 1
        stage.setTitle("Hello World!");
        stage.show();

        // Lesson 2
        /*
        Stage object behaves as the program's window
        Scene object contains an object responsible for arranging the
        components belonging to the scene (such as FlowPane)
         */
        Button button = new Button("This is a button");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        /*
        UI components are added as "children" to the object responsible for
        setting them - FlowPane.
         */

        Scene scene =  new Scene(componentGroup);

        stage.setScene(scene);
        stage.show();
    }
}
