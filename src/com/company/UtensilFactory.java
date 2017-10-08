package com.company;

public class UtensilFactory {

    //В зависимости от аргумента type возвращаем тип прибора
    public static Utensil getUtensil(String type) {
        if ("spoon".equalsIgnoreCase(type)) {
            return new Spoon();
        } else {
            return new Fork();
        }
    }
}
