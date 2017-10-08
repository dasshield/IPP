package com.company;

public class FirstDish extends Dish {
    public FirstDish(String name, String cuisine, Float weight, boolean isDeliveryEnabled) {
        super(name, cuisine, weight, isDeliveryEnabled, true);
    }
}
