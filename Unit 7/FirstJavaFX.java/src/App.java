import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class App extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() 
        { 
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Hello World!");
            }
        });*/
        
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
  
        /*
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        */
  
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(Color.GREEN);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) 
    {
        launch(args);
    }
} 
