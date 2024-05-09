import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class App extends Application
{
    public void start(Stage primaryStage) throws IOException
    {
        HBox h = new HBox();
        VBox v = new VBox();
        Label l1 = new Label("Country");
        Label l2 = new Label("India");
        v.getChildren().add(l1);
        v.getChildren().add(l2);
        FileInputStream fin = new FileInputStream("D:\\Programming\\Sun.jpg");
        Image ig = new Image(fin);
        ImageView imgview = new ImageView(ig);
        imgview.setFitHeight(200);
        imgview.setFitWidth(200);
        h.getChildren().add(v);
        h.getChildren().add(imgview);
        Scene scene = new Scene(h,400,400);
        primaryStage.setTitle("Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}