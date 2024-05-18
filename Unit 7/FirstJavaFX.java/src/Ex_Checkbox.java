import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
public class Ex_Checkbox extends Application
{
    CheckBox c1 = new CheckBox("Bold");
    CheckBox c2 = new CheckBox("Italic");
    Text t1 = new Text("Java is Fun");
    Font fontBold = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
    Font fontItalic = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.ITALIC,20);
    Font fBoth = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20);
    Font fNormal = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);
    public void start(Stage primaryStage)
    {
        VBox root = new VBox(10);
        root.getChildren().add(c1);
        root.getChildren().add(c2);
        root.getChildren().add(t1);
        c1.setOnAction(new FontHandler());
        c2.setOnAction(new FontHandler());
        Scene scene = new Scene(root);
        primaryStage.setTitle("CheckBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class FontHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            if (c1.isSelected() && c2.isSelected()) 
            {
                t1.setFont(fBoth);                                               
            }    
            else if (c1.isSelected()) 
            {
                t1.setFont(fontBold);                
            }
            else if(c2.isSelected())
            {
                t1.setFont(fontItalic);
            }
            else
            {
                t1.setFont(fNormal);
            }
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}