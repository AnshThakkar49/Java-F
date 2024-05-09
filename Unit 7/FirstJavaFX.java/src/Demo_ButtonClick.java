import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;;
public class Demo_ButtonClick extends Application
{
    private final Circle c1 = new Circle(50);
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        HBox h = new HBox();
        root.setCenter(c1);
        Button b1 = new Button("Enlarge");
        Button b2 = new Button("Shrink");
        Button b3 = new Button("Reset");
        h.getChildren().add(b1);
        h.getChildren().add(b2);
        h.getChildren().add(b3);
        h.setAlignment(Pos.CENTER);
        root.setBottom(h);
        b1.setOnAction(new EnlargeCircle());
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class EnlargeCircle implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            c1.setRadius(c1.getRadius()+2);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }     
}