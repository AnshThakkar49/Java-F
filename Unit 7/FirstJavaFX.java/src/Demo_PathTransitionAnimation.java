import javafx.scene.paint.*;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.util.*;
import javafx.stage.*;
public class Demo_PathTransitionAnimation extends Application
{
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        Circle c = new Circle(50);
        c.setStrokeWidth(10);
        c.setFill(Color.ORANGE);
        root.getChildren().add(c);
        PathTransition pt = new PathTransition(Duration.millis(1200),new Line(100,100,200,200),c);
        pt.setCycleCount(5);
        pt.play();
        pt.setAutoReverse(true);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}