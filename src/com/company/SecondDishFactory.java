package com.company;

public class SecondDishFactory implements DishAbstractFactory {

    @Override
    public Dish createDish(String name, String cuisine, Float weight) {
        //создаем новый экземпляр класса SecondDish с помощью шаблона строитель
        return new DishBuilder()
                .setName(name)
                .setcuisine(cuisine)
                .setWeight(weight)
                .setDelieveryEnabled(true)
                .buildSecondDish();
    }
}