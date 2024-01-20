package com.example.binary;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Number Translator");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/binary.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}