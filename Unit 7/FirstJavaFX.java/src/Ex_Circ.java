import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
 
public class Ex_Circ extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        StackPane p = new StackPane();
        Circle c1 = new Circle();
        c1.setRadius(80);
        Color c = Color.hsb(270, 1.0, 1.0, 0.7);
        c1.setFill(c);
        Label l1 = new Label("JavaFX");
        p.getChildren().add(c1);
        p.getChildren().add(l1);
        Scene scene = new Scene(p,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
