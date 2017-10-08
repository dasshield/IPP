package com.company;

public class Dish implements Cloneable{

    //required parameters
    private String name;
    private String cuisine;
    private Float weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setcuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setDeliveryEnabled(boolean deliveryEnabled) {
        isDeliveryEnabled = isDeliveryEnabled;
    }


    //optional parameters
    private boolean isDeliveryEnabled;
    private boolean isFirstDish;

    @Override
    public String toString() {
        return "Name: " + name + " cuisine: " + cuisine + " Weight: " + weight + " With delivery: " + isDeliveryEnabled;
    }

    public String getName() {
        return name;
    }

    public String getcuisine() {
        return cuisine;
    }

    public Float getWeight() {
        return weight;
    }

    public boolean isDeliveryEnabled() {
        return isDeliveryEnabled;
    }

    protected Dish(String name, String cuisine, Float weight, boolean isDeliveryEnabled, boolean isFirstDish) {
        this.name = name;
        this.cuisine = cuisine;
        this.weight = weight;
        this.isDeliveryEnabled = isDeliveryEnabled;
        this.isFirstDish = isFirstDish;
    }

    @Override
    protected Dish clone() {
        return new Dish(name, cuisine, weight, isDeliveryEnabled, isFirstDish);
    }

}
