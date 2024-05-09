import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Ex_FlowPane extends Application
{
    public void start(Stage primaryStage)
    {
        FlowPane f1 = new FlowPane();
        TextField t1 = new TextField();
        Button btn =  new Button();
        Label l1 = new Label("JavaFX");
        Scene scene = new Scene(f1,200,300);
        btn.setText("Cick Here");
        f1.getChildren().add(t1);
        f1.getChildren().add(btn);
        f1.getChildren().add(l1);
        f1.setHgap(5);
        f1.setVgap(20);
        f1.setAlignment(Pos.CENTER);
        f1.setOrientation(Orientation.VERTICAL);
        primaryStage.setTitle("Flow-Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
