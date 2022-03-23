package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.ResourceBundle;

import java.net.URL;

public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView gradientImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        File gradientFile = new File("images/gradient.jpg");
        Image gradientImage = new Image(gradientFile.toURI().toString());
        gradientImageView.setImage(gradientImage);
    }


    public void loginButtonOnAction(ActionEvent event)
    {
        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
            validateLogin();
        }
        else {
            loginMessageLabel.setText("Please enter username and(or) password");
        }
    }

    public void cancelButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin() {
        Connection connectDB = DatabaseConnection.getConnection();

        String verifyLogin = "SELECT count(1) FROM account WHERE username = '" + usernameTextField.getText() + "' and password = '" + enterPasswordField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet rs = statement.executeQuery(verifyLogin);

            while(rs.next()) {
                if(rs.getInt(1) == 1) {
                    String getRoleByAccountID = "SELECT role FROM account WHERE username = '" + usernameTextField.getText() + "'";

                    Statement st = connectDB.createStatement();
                    ResultSet rs_ = st.executeQuery(getRoleByAccountID);

                    rs_.next();
                    if (rs_.getString("role").equals("admin")) {
                        admin();

                    } else {
                        //user();
                    }
                }else {
                    loginMessageLabel.setText("Invalid login. Try again!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void admin() {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("trip.fxml"));
            Stage tripStage = new Stage();
            tripStage.initStyle(StageStyle.UNDECORATED);
            tripStage.setScene(new Scene(root, 600, 400));
            tripStage.show();

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
