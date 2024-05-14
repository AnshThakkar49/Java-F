import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class LoanCalc extends Application
{
    public void start(Stage primaryStage)
    {
        GridPane g1 = new GridPane();
        Label l1 = new Label("Annual Intrest Rate");
        Label l2 = new Label("Number of Years");
        Label l3 = new Label("Loan Amount");
        Label l4 = new Label("Monthly Payment");
        Label l5 = new Label("Total Payment");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        TextField t5 = new TextField();
        Button b1 =  new Button("Calculate");
        g1.setVgap(10);
        g1.add(l1, 0, 0);
        g1.add(l2, 0, 1);
        g1.add(l3, 0, 2);
        g1.add(l4, 0, 4);
        g1.add(l5, 0, 5);
        g1.add(t1, 1, 0);
        g1.add(t2, 1, 1);
        g1.add(t3, 1, 2);
        g1.add(b1, 1, 3);
        g1.add(t4, 1, 4);
        g1.add(t5, 1, 5);
        b1.setOnAction(e->
        {
            double p = Double.parseDouble(t3.getText());
            double r = Double.parseDouble(t1.getText())/1200;
            double n = Double.parseDouble(t2.getText())*12;
            double emi,total;
            emi = p*r*(Math.pow((1+r), n))/(Math.pow((1+r), n)-1);
            total = emi*n;
            t4.setText(String.format("Rs: %.2f", emi));
            t5.setText(String.format("Rs: %.2f", total));
        });
        Scene scene = new Scene(g1);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
