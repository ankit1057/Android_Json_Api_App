package com.example.farzad.ecommerce.model;

public class Product {

    private String name,address,imageUri;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(){

    }

    public Product(String name, String address, String imageUri,int id) {
        this.name = name;
        this.address = address;
        this.imageUri = imageUri;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String Title(){
        return "title";
    }

}
