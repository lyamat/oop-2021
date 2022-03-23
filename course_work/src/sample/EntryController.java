package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class EntryController implements Initializable {

    @FXML
    private ImageView gradient3ImageView;

    @FXML
    private Button exitButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File gradientFile = new File("images/gradient3.jpg");
        Image gradientImage = new Image(gradientFile.toURI().toString());
        gradient3ImageView.setImage(gradientImage);
    }

    public void singInButtonOnAction(ActionEvent event)
    {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("tlogin.fxml"));
            Stage loginStage = new Stage();
            loginStage.initStyle(StageStyle.UNDECORATED);
            loginStage.setScene(new Scene(root, 799, 494));
            loginStage.show();

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void singUpButtonOnAction(ActionEvent event)
    {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage = new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root, 326, 597));
            registerStage.show();

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void exitButtonOnAction(ActionEvent event)
    {
        try{
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
