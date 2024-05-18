import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.*;
public class Ex_RadioButton extends Application
{
    public void start(Stage primaryStage)
    {
        VBox root = new VBox();
        RadioButton rbred = new RadioButton("Red");
        RadioButton rbgreen = new RadioButton("Green");
        RadioButton rbblue = new RadioButton("Blue");
        root.getChildren().add(rbblue);
        root.getChildren().add(rbred);
        root.getChildren().add(rbgreen);
        ToggleGroup group = new ToggleGroup();
        rbblue.setToggleGroup(group);
        rbred.setToggleGroup(group);
        rbgreen.setToggleGroup(group);
        Text t1 = new Text("Java is Fun");
        root.getChildren().add(t1);
        rbred.setOnAction(e->
        {
            t1.setFill(Color.RED);
        });
        rbblue.setOnAction(e->
        {
            t1.setFill(Color.BLUE);
        });
        rbgreen.setOnAction(e->
        {
            t1.setFill(Color.GREEN);
        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("KeyPressed");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
