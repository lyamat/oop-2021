package sample;

import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Trip {

    private SimpleIntegerProperty tripID;
    private SimpleStringProperty country;
    private SimpleIntegerProperty cost;

    public Trip(int tripID, String country, int cost) {
        this.tripID = new SimpleIntegerProperty(tripID);
        this.country = new SimpleStringProperty(country);
        this.cost = new SimpleIntegerProperty(cost);
    }

    public int getTripID() {
        return tripID.get();
    }

    public SimpleIntegerProperty tripIDProperty() {
        return tripID;
    }

    public String getCountry() {
        return country.get();
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public int getCost() {
        return cost.get();
    }

    public SimpleIntegerProperty costProperty() {
        return cost;
    }

    public void setTripID(int tripID) {
        this.tripID.set(tripID);
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public void setCost(int cost) {
        this.cost.set(cost);
    }
}