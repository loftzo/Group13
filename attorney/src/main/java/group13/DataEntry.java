package group13;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class DataEntry extends Application{
    
    public DataEntry(){
        //init gui

    }

    public static void main(String[] args) {
        //handle gui
        new DataEntry();
        launch();
    }

    public boolean validateForms(AttorneyForm af){
        //Make sure email is formatted
        //All forms have input
        //Phone number is 10 digits
        //etc.
        return true;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
        // Load root layout from fxml file.
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(this.getClass().getResource("DataEntryScreen.fxml"));

        Parent parent = loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(parent);
        primaryStage.setTitle("Attorney Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}