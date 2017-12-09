package com.ladislav.controllers;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

  public static final int DEFAULT_WIDTH = 300;
  public static final int DEFAULT_HEIGHT = 275;

  public static void changeScene(Stage stage, URL resource) throws IOException {
    changeScene(stage, resource, DEFAULT_WIDTH, DEFAULT_HEIGHT);
  }

  public static void changeScene(Stage stage, URL resource, int width, int height)
      throws IOException {
    FXMLLoader loader = new FXMLLoader(resource);
    Parent root = loader.load();
    Controller controller = loader.getController();
    controller.setStage(stage);
    stage.setScene(new Scene(root, width, height));
  }
}
