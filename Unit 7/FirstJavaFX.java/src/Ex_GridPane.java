import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Ex_GridPane extends Application 
{
    public void start(Stage primaryStage) 
    {
        GridPane g1 = new GridPane();
        g1.setPadding(new Insets(11.5,10.2,11.5,14.5));
        g1.setHgap(5);
        g1.setVgap(5);
        Label l1 = new Label("00");
        Label l2 = new Label("01");
        Label l3 = new Label("11");
        Label l4 = new Label("20");
        Label l5 = new Label("21");
        Label l6 = new Label("10");
        g1.add(l1, 0, 0);
        g1.add(l2, 1, 0);
        g1.add(l3, 0, 1);
        g1.add(l4, 1, 1);
        g1.add(l5, 0, 2);
        g1.add(l6, 0, 1);     
        Scene scene = new Scene(g1,200,300);
        
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
