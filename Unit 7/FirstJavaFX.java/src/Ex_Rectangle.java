import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class Ex_Rectangle extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        Rectangle R1 = new Rectangle(10,10,150,150); //X,Y,Width,Height
        R1.setStroke(Color.PINK);
        R1.setStrokeWidth(10);
        R1.setArcWidth(10);
        R1.setArcHeight(15);
        R1.setFill(Color.RED);
        root.getChildren().add(R1);
        Scene scene = new Scene(root,200,300);
        primaryStage.setTitle("Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }    
} 