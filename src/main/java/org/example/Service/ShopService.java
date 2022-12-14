package org.example.Service;

import org.example.Model.Order;
import org.example.Model.Product;
import org.example.Repo.OrderRepo;
import org.example.Repo.ProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo = new ProductRepo();
    private final OrderRepo orderRepo = new OrderRepo();

    public Product getProductById(int id) {
        return productRepo.getById(id);
    }

    public List<Product> listProducts(){
        return productRepo.getProductList();
    }

    public void addOrder(int[] einkaufliste){

        List<Product> products = new ArrayList<>();

        for(int id: einkaufliste){
            Product p = productRepo.getById(id);
            if (p.getId() == id) {
                products.add(p);
            }
        }

        orderRepo.add(products);
        System.out.println("new order accept");

    }

    public Order getOrderById(int n){
        return orderRepo.getById(n);
    }

    public List<Order> listOrders(){
        return orderRepo.getOrderList();
    }
}
