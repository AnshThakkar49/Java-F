import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class Ex_Ellipse extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        Ellipse e1 = new Ellipse(100,5,100,200); //CenterX,CenterY,RadiusX,RadiusY
        e1.setStroke(Color.PINK);
        e1.setStrokeWidth(10);
        e1.setFill(Color.RED);
        root.getChildren().add(e1);
        Scene scene = new Scene(root,200,300);
        primaryStage.setTitle("Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    
}