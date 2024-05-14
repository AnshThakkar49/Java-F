import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Circul extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Pane p = new Pane();
        Circle c1 = new Circle();
        c1.setRadius(50);
        Color c = new Color(0, 25, 75, 0.7);
        c1.setFill(c);
        c1.setStroke(Color.RED);
        p.getChildren().add(c1);
        Scene scene = new Scene(p,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
