package sample;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Order {

    private static ObservableList<Trip> order = FXCollections.observableArrayList();
    
    private final IntegerProperty orderId;
    private final DoubleProperty totalPrice;
    
    public Order() {
        orderId = new SimpleIntegerProperty();
        totalPrice = new SimpleDoubleProperty();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice.set(totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice.get();
    }

    public DoubleProperty totalPriceProperty() {
        return totalPrice;
    }

    public void addTrip(Trip trip){
        order.add(trip);
    }

    public boolean removeTrip(int tripNum){
        order.remove(tripNum);
        return true;
    }
}