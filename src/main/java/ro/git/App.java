package ro.git;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;


/**
 * Hello world!
 *
 */
public class App extends Application
{   private Button button = new Button("Next Page");
    private static Button button1 = new Button("Message");
    Scene scene1;
    Stage window;
    public static void main( String[] args )
    {
        //TODO Create a app Home Inteligents
        //TODO Create A Class Home
        Home home = new Home("Nechiforel", true);
        home.setMetriPatrati(home.calculeazaM4(10.5,7.8));

        launch(args);



    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window =primaryStage;
        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();});

        Label label1 = new Label("This is a Main");
        button.setOnAction(event -> Display.display("WARING","INCEARCA SA INTRODUCI CE TREBUIEK"));
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> {
            event.consume();
            closeProgram();
        });


        button1.setOnAction(event -> {
            boolean result = Display.confirmBox("Callendar ", "check it out" );
            if (result == false){
                System.out.println("Nu iti convine ce ai ales ");
            }else {
                System.out.println("Sa facut trimiterea");
            }

        });

        VBox layout = new VBox(30);
        layout.getChildren().addAll(label1,button,button1,closeButton);
        layout.setAlignment(Pos.CENTER);

        scene1 = new Scene(layout,250 ,300);

        window.setTitle("Main");
        window.setScene(scene1);
        window.show();


    }


    public void closeProgram() {
        boolean answer = Display.confirmBox("Save" ,"Do you want this save documnet");
        if (answer){
            System.out.println("This file is saved");
            window.close();
        }
    }


}
