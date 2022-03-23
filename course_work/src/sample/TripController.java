package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TripController implements Initializable {

    @FXML
    private TableView<Trip> tripTableView;

    @FXML
    private TableColumn<Trip, Integer> tripIDColumn;

    @FXML
    private TableColumn<Trip, String> tripCountryColumn;

    @FXML
    private TableColumn<Trip, Integer> tripCostColumn;

    @FXML
    private TextField countryTextField;

    @FXML
    private TextField costTextField;

    @FXML
    private Label addedTripLabel;

    @FXML
    private Button signOutButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tripIDColumn.setCellValueFactory(new PropertyValueFactory<Trip,Integer>("tripID"));
        tripCountryColumn.setCellValueFactory(new PropertyValueFactory<Trip,String>("country"));
        tripCostColumn.setCellValueFactory(new PropertyValueFactory<Trip,Integer>("cost"));

        ObservableList<Trip> listM = getDataTrips();
        tripTableView.setItems(listM);
    }

    public void addTripButtonOnAction (ActionEvent event) {
        if (countryTextField.getText().isBlank() == false && costTextField.getText().isBlank() == false) {
            addTrip();
        }
        else {
            addedTripLabel.setText("Please enter country and(or) cost");
        }
    }

    public void signOutButtonOnAction (ActionEvent event) {
        Stage stage = (Stage) signOutButton.getScene().getWindow();
        stage.close();
    }

    public void addTrip(){

        Connection connectDB = DatabaseConnection.getConnection();

        String country = countryTextField.getText();
        String cost = costTextField.getText();

        String insertFields = "INSERT INTO trip (country, cost) VALUES ('";
        String insertValues = country + "','" + cost + "')";
        String insertToRegister = insertFields + insertValues;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            addedTripLabel.setText("Trip has been added successfully!");

            ObservableList<Trip> listM = getDataTrips();
            tripTableView.setItems(listM);

        } catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public static ObservableList<Trip> getDataTrips() {
        Connection connectDB = DatabaseConnection.getConnection();

        ObservableList<Trip> list = FXCollections.observableArrayList();

        String getAllTrips = ("SELECT * FROM trip");

        try {
            Statement statement = connectDB.createStatement();
            ResultSet rs = statement.executeQuery(getAllTrips);

            while (rs.next()) {
                list.add(new Trip(Integer.parseInt(rs.getString("trip_id")), rs.getString("country"), rs.getInt("cost")));
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return list;
    }
}
