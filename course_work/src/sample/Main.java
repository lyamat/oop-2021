package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        DatabaseConnection connectNow = DatabaseConnection.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("entry.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 381, 229));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
