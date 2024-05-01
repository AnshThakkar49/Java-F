import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class App extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        btn.setText("Click Here");
        Pane root = new Pane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(Color.GREEN);
        primaryStage.setTitle("Hello Word");
        primaryStage.setScene(scene);
        primaryStage.show();      
    }
    public static void main(String[] args) 
    {
        launch(args);        
    }  
}
