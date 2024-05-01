import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
public class A extends Application 
{
    public void start(Stage primaryStage)
    {
        StackPane p = new StackPane();
        Label l1 = new Label("JavaFX");
        Font F = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30);
        l1.setFont(F);
        p.getChildren().add(l1);
        Scene scene = new Scene(p, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
    public static void main(String[] args) 
    {
        launch(args);
    }
}