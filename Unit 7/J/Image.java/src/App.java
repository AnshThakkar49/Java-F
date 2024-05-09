import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
public class App extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane p = new StackPane();
        Image img = new Image("C:\Users\SHIVSHAKTI\Downloads\sunset-1373171_1280.jpg");
        ImageView imgview = new ImageView();
        p.getChildren().add(imgview);
        Scene scene = new Scene(p);
        primaryStage.setTitle("Image");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }    
    public static void main(String[] args) 
    {
        launch(args);        
    }
}
