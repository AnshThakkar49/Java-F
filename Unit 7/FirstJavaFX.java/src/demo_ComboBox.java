import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
public class demo_ComboBox extends Application
{
    public void start(Stage primaryStage)
    {
        GridPane g1 = new GridPane();
        ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("India","USA","UAE","Australia");
        cb.setValue("Select");
        Label l1 = new Label("Country");
        Label l2 = new Label();
        g1.add(l1, 0, 0);
        g1.add(cb, 1, 0);
        g1.add(l2, 1, 1);
        g1.setVgap(10);  
        g1.setHgap(10);
        g1.setGridLinesVisible(true);  
        cb.setOnAction(e->
        {
            l2.setText(cb.getValue());
        });      
        Scene scene = new Scene(g1,400,400);
        primaryStage.setTitle("COMBOBOX");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }
}