package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orderList;

    public OrderRepo() {
        orderList = new ArrayList<>();
    }

    public OrderRepo(List<Order> orderList) {
        this.orderList = orderList;
    }


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    public Order getById(int n){
        for(Order o:orderList){
            if(o.getId()==n){
                return o;
            }
        }
        return null;
    }

    public void add(List<Product> products){
        Order o = new Order(orderList.size()+1,products);
        orderList.add(o);
    }
}
