import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFXjava extends Application {
    public static void run(){
        launch();
    }
    public void start(Stage stage) throws Exception{
        String version = System.getProperty("javafx.version");
        Label label1 = new Label("Hello from JavaFX: " + version);
        Label label2 = new Label("Hej IT numse!");
        Label label3 = new Label( "Egon har en plan i fremtiden");
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true); // Only for debugging/layouting
        gridPane.add(label1,0,0);
        gridPane.add(label2,1,1);
        gridPane.add(label3, 0, 1);
        Scene scene = new Scene(gridPane, 640,480);
        stage.setScene(scene);
        stage.show();
    }
}