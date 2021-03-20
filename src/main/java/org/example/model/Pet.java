package org.example.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pet {

    @SerializedName("photoUrls")
    private List<String> photoUrls;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("category")
    private Category category;

    @SerializedName("tags")
    private List<TagsItem> tags;

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


    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setTags(List<TagsItem> tags) {
        this.tags = tags;
    }

    public List<TagsItem> getTags() {
        return tags;
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