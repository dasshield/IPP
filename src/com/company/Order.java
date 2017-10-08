package com.company;

public class Order implements Cloneable {

    private String address;
    private List<Dish> orderList = new ArrayList<>();

    public Order() {}

    public Order(String address, List<Dish> orderList) {
        this.address = address;
        this.orderList = orderList;
    }

    public void addOrder(Dish dish) {
        orderList.add(dish);
    }

    public List<Dish> getOrderList() {
        return orderList;
    }

}
