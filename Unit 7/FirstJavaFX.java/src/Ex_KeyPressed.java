import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Ex_KeyPressed extends Application
{
    public void start(Stage primaryStage)
    {
        VBox root = new VBox(10);
        TextField t1 = new TextField();
        Label l1 = new Label();
        root.getChildren().add(t1);
        root.getChildren().add(l1);
        t1.setOnKeyPressed(e->
        {
            l1.setText(t1.getText());
        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("KeyPressed");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }    
    public static void main(String[] args) {
        launch(args);
    }
}
