import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class Ex_Line extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        Line l1 = new Line(10,10,150,150);
        /*l1.setStartX(10);
        l1.setStartY(10);
        l1.setEndX(150);
        l1.setEndY(150);*/
        l1.setStroke(Color.PINK);
        l1.setStrokeWidth(10);
        root.getChildren().add(l1);
        Scene scene = new Scene(root,200,300);
        primaryStage.setTitle("Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }    
}