import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.Button;
public class Prob extends Application
{
    public void start(Stage primaryStage)
    {
        Circle c1 = new Circle(50);
        BorderPane root = new BorderPane();
        HBox h = new HBox();
        Button b1 = new Button("Rotate");
        h.setAlignment(Pos.CENTER);
        h.getChildren().add(b1);
        
        c1.setFill(Color.WHITE);
        c1.setStrokeWidth(10);
        c1.setStroke(Color.BLACK);
        root.setBottom(h);

        b1.setOnAction(e-> //Lambda
        {
            PathTransition pt = new PathTransition(Duration.millis(1200),new Line(100,100,200,200),c1);
            pt.setCycleCount(5);
            pt.play();
            pt.setAutoReverse(true);
        });
        root.setBottom(h);
        Scene scene = new Scene(root,400,400);
        root.setCenter(c1);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
