import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
public class Ex_FadeTransition extends Application
{
    public void start(Stage primaryStage)
    {
        Circle c1 = new Circle(100);
        StackPane root = new StackPane();
        c1.setFill(Color.PINK);
        root.getChildren().add(c1);
        c1.setOnMouseClicked(e->
        {
            FadeTransition ft = new FadeTransition(Duration.millis(1200),c1);
            ft.setFromValue(1.0);
            ft.setToValue(0.1);
            ft.setCycleCount(Timeline.INDEFINITE);
            ft.setAutoReverse(true);
            ft.play();
        });
        Scene scene = new Scene(root,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    public static void main(String[] args) {
        launch(args);
    }
}