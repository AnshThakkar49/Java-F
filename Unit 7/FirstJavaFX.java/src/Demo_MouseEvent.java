import javafx.scene.paint.*;
import javafx.application.Application;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;
public class Demo_MouseEvent extends Application
{
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        Text t1 = new Text(20,20,"Programming is Fan");
        root.getChildren().add(t1);
        t1.setOnMouseDragged(e->
        {
            t1.setX(e.getX());
            t1.setY(e.getY());
            t1.setFill(Color.RED);
        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    public static void main(String[] args) {
        launch(args);
    }
}