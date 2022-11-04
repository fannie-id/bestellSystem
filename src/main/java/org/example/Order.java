package org.example;

import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private List<Product> products;

    public Order() {
    }

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductsList() {
        return products;
    }

    public void setProductsList(List<Product> productsList) {
        this.products = productsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderList=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        return Objects.equals(products, order.products);
    }
}
