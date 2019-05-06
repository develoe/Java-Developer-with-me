package ro.git;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.Scanner;

public class Display {
    public static boolean result ;
    static Stage window;
    public static void display(String title, String message) {
         window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(350);

        Label label1 = new Label();
        label1.setText(message);

        Button closeButton = new Button("Close The Window");
        closeButton.setOnAction(event -> window.close());


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1,closeButton);
        layout.setAlignment(Pos.CENTER);
        label1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

    }
    public static boolean confirmBox(String title,String message){
        window = new Stage();
        window.setMinHeight(120);
        window.setMinWidth(300);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        Label label = new Label(message);

        Button yesButton = new Button("Yes");
        Button closeButton = new Button("No");
        yesButton.setOnAction(event -> {
            result = true;
            window.close();
        });
        closeButton.setOnAction(event -> {
            result = false;
            window.close();

        });

        VBox layout = new VBox(25);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label,yesButton,closeButton);

        Scene scene = new Scene(layout);


        window.setScene(scene);
        window.showAndWait();

        return result;
    }

}
