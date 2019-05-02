package ro.git;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;


/**
 * Hello world!
 *
 */
public class App extends Application implements EventHandler<ActionEvent>
{   Button button,button2 ;
    Scene scene1,scene2;
    Stage window;
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
        window = primaryStage;
        button = new Button("Press Me");
        VBox layout = new VBox(20);
        layout.getChildren().add(button);
        scene1 = new Scene(layout,250 ,300);
        button.setOnAction(this);
        window.setTitle("Main");
        window.setScene(scene1);
        window.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button){
            System.out.println("ce faci");
        }
    }
}
