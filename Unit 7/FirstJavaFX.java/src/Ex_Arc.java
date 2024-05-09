import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class Ex_Arc extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        Arc a1 = new Arc(150,100,80,80,30,35);
        a1.setType(ArcType.ROUND);
        a1.setStroke(Color.PINK);
        a1.setStrokeWidth(10);
        a1.setFill(Color.RED);
        root.getChildren().add(a1);
        Scene scene = new Scene(root,200,300);
        primaryStage.setTitle("Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
    

