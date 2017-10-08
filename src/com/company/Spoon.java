package com.company;


//класс 'Ложка' наследует от абстрактного класса 'Прибор'
public class Spoon extends Utensil {
    @Override
    public boolean isToothy() {
        return false;
    }
}
