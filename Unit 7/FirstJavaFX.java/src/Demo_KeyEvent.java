import javafx.scene.paint.*;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
public class Demo_KeyEvent extends Application
{
    public void start(Stage primaryStage)
    {
        Text t1 = new Text(20,20,"A");
        t1.setFont(Font.font(80));
        t1.setFill(Color.ORANGE);
        StackPane root = new StackPane();
        root.getChildren().add(t1);
        t1.setOnKeyPressed(e->
        {
            t1.setText(e.getText());
        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
        t1.requestFocus();
    }      
    public static void main(String[] args) {
        launch(args);
    }  
}