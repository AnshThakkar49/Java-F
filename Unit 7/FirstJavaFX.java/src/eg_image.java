import java.io.FileInputStream;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.image.*;
public class eg_image extends Application
{
    public void start(Stage primaryStage) throws IOException
    {
        Pane p = new StackPane();
        FileInputStream fin = new FileInputStream("D:\\Programming\\Java\\Java\\Unit 7\\Sun.jpg");
        Image ig = new Image(fin);
        ImageView imgview = new ImageView(ig);
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
