package com.company;

public class FirstDishFactory implements DishAbstractFactory {

    @Override
    public Dish createDish(String name, String cuisine, Float weight) {
        //создаем новый экземпляр класса FirstDish с помощью шаблона строитель
        return new DishBuilder()
                .setName(name)
                .setcuisine(cuisine)
                .setWeight(weight)
                .setDelieveryEnabled(true)
                .buildFirstDish();
    }
}
