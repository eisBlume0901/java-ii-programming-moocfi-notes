package Part13.UIComponentsAndTheirLayout;
// https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception
    {
//        Label textComponent = new Label("Text element");
//        Label textComponent1 = new Label();
//        textComponent1.setText("Text Component");
//        /*
//        Label class allows to display text. It offers methods for modifying
//        the text it contains.
//        Methods:
//        1. Constructor
//        Label textComponent = new Label("Put your text inside");
//        2. setText method
//        Label textComponent1 = new Label();
//        textComponent1.setText("Put your text inside");
//         */
//        FlowPane componentGroup = new FlowPane();
//        componentGroup.getChildren().add(textComponent);
//
//        Scene view = new Scene(componentGroup);
//
//        stage.setScene(view);
//        stage.show();

        Label textComponent = new Label("Please click the button\n");
        Button button = new Button("Click me!");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(button);

        Scene scene = new Scene(componentGroup);

        stage.setScene(scene);
        stage.show();
    }
}
