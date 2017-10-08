package com.company;

public class OrderManagerSingleton {
    private static volatile OrderManagerSingleton instance;
    private Order order = new Order();

    private OrderManagerSingleton() {}

    public static OrderManagerSingleton getInstance() {
        // Если экземпляр отсутствует - создаем новый
        if (instance == null) {
            synchronized (OrderManagerSingleton.class) {
                if (instance == null) {
                    instance = new OrderManagerSingleton();
                }
            }
        }
        return instance;
    }

    public Order getOrder() {
        return order;
    }

    public void addDish(Dish dish) {
        order.addOrder(dish);
    }

}
