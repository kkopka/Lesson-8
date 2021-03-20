package org.example.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pet {


    @SerializedName("id")
    private int id;

    @SerializedName("status")
    private String status;

    @SerializedName("petId")
    private int petId;

    @SerializedName("shipDate")
    private String shipDate;

    @SerializedName("quantity")
    private int quantity;

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    @SerializedName("complete")
    private String complete;

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return
                "Pet{" +
                        ",id = '" + id + '\'' +
                        ",petId = '" + petId + '\'' +
                        ",quantity = '" + quantity + '\'' +
                        ",shipDate = '" + shipDate + '\'' +
                        ",status= '" + status + '\'' +
                        ",complete = '" + complete + '\'' +
                        "}";
    }
}