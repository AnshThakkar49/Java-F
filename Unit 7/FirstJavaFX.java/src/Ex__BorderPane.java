import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Ex__BorderPane extends Application 
{
    public void start(Stage primaryStage)
    {
        BorderPane b1 = new BorderPane();
        Label l1 = new Label("Top");
        Label l2 = new Label("Bottom");
        Label l3 = new Label("Right");
        Label l4 = new Label("Left");
        Label l5 = new Label("Centre");
        b1.setStyle("-Fx-background-color:yellow");    
        b1.setTop(l1);
        b1.setRight(l3);
        b1.setBottom(l2);
        b1.setLeft(l4);
        b1.setCenter(l5);
        Scene scene = new Scene(b1,200,300);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}