package com.company;


public class DishBuilder {

    private String name;
    private String cuisine;
    private Float weight;

    private boolean isDeliveryEnabled;

    public DishBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DishBuilder setcuisine(String cuisine) {
        this.cuisine = cuisine;
        return this;
    }

    public DishBuilder setWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    public DishBuilder setDelieveryEnabled(boolean isDeliveryEnabled) {
        this.isDeliveryEnabled = isDeliveryEnabled;
        return this;
    }

    //создаем новый экземпляр класса FirstDish
    public FirstDish buildFirstDish() {
        return new FirstDish(name, cuisine, weight, isDeliveryEnabled);
    }

    //создает новый экземпляр класса SecondDish
    public SecondDish buildSecondDish() {
        return new SecondDish(name, cuisine, weight, isDeliveryEnabled);
    }

}
