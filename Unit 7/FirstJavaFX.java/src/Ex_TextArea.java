import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.TextArea;
public class Ex_TextArea extends Application
{
    public void start(Stage primaryStage)
    {
        FlowPane root = new FlowPane();
        TextArea ta = new TextArea();
        root.getChildren().add(ta);
        ta.setPrefColumnCount(10);
        ta.setPrefRowCount(5);
        ta.setWrapText(true);
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("TextArea");
        primaryStage.setScene(scene);
        primaryStage.show();     
    }
    public static void main(String[] args) {
        launch(args);
    }
}