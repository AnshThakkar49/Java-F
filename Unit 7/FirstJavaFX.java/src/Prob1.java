import javafx.scene.shape.Circle;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
public class Prob1 extends Application
{
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Circle c1 = new Circle(50);
        root.getChildren().add(c1);
        PathTransition pt = new PathTransition(Duration.millis(1200),new Circle(300,300,200),c1);
        pt.setCycleCount(50);
        pt.play();
        root.setOnMousePressed(e->
        {
            pt.pause();
        });    
        root.setOnMouseReleased(e->
        {
            pt.play();
        });   
        Scene scene = new Scene(root,600,600);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
