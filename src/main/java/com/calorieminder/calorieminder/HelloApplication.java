package com.calorieminder.calorieminder;

import com.calorieminder.calorieminder.Model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        User user = new User();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CalorieMinderIntroPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
        welcomeFrame start = fxmlLoader.getController();
        start.addFt();
        start.addIn();
        start.addActivities();
        start.addSex(); //adds sex
    }

    public static void main(String[] args) {
        launch();
    }
}