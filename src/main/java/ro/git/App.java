package ro.git;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.lang.model.element.NestingKind;

/**
 * Hello world!
 *
 */
public class App extends Application implements EventHandler<ActionEvent>
{   private Button button;
    public static void main( String[] args )
    {
        //TODO Create a app Home Inteligents
        //TODO Create A Class Home
        Home home = new Home("Nechiforel", true);
        home.setMetriPatrati(home.calculeazaM4(10.5,7.8));
        System.out.printf("%.2f",home.getMetriPatrati());
        launch(args);



    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is the Best Application");
        button = new Button();
        button.setText("Pres Me");
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);



        Scene scene = new Scene(layout,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button){
            System.out.println("ce faci");
        }
    }
}
