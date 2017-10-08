package com.company;


//Абстрактная фабрика
public interface DishAbstractFactory {

    Dish createDish(String name, String cuisine, Float weight);

}
