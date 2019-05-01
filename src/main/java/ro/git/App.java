package ro.git;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;


/**
 * Hello world!
 *
 */
public class App extends Application implements EventHandler<ActionEvent>
{   private Button button = new Button("Next Page");
    Scene scene1,scene2;
    Window window;
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
        window =primaryStage;
        Label label1 = new Label("This is a Main");
        button.setOnAction(e -> window.setScene(scene2));
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button){
            System.out.println("ce faci");
        }
    }
}
