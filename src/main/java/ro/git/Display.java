package ro.git;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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
        // Block all the other window application
        // my windows settings
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(350);
        // declaration and attribution of the text
        Label label1 = new Label();
        label1.setText(message);

        Button closeButton = new Button("Close The Window");
        closeButton.setOnAction(event -> window.close());

// Setting, declarations and attribution  of the Layout
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1,closeButton);
        layout.setAlignment(Pos.CENTER);
        label1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

    }
    public static boolean confirmBox(String title,String message) {
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


        VBox center = new VBox(10);
        VBox left = new VBox(10);
        VBox right = new VBox(30);
        center.setAlignment(Pos.TOP_CENTER);
        center.getChildren().add(label);
        left.getChildren().add(yesButton);
        right.getChildren().addAll(closeButton);

        BorderPane layout = new BorderPane();
        layout.setTop(center);
        layout.setRight(right);
        layout.setLeft(left);

        Scene scene = new Scene(layout,300,250);

        window.setScene(scene);
        window.showAndWait();

        return result;
    }

}
