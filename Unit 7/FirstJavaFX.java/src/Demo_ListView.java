import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
public class Demo_ListView extends Application
{
    public void start(Stage primaryStage)
    {
        GridPane root = new GridPane();
        ListView<String> v1 = new ListView<>();
        v1.getItems().addAll("India","USA","USSR","UAE","Austria");
        v1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Button btn = new Button("Click Here");
        root.add(v1, 0, 0);
        root.add(btn, 0 ,1);
        btn.setOnAction(e->
        {
            System.out.println(v1.getSelectionModel().getSelectedItems());
        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("ListView");
        primaryStage.setScene(scene);
        primaryStage.show();     
    }
    public static void main(String[] args) {
        launch(args);
    }
}