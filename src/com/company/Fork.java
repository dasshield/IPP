package com.company;

//Класс 'Вилка' наследует от абстракного класса 'Прибор'
public class Fork extends Utensil {
    @Override
    public boolean isToothy() {
        return true;
    }
}
