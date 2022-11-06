package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderRepo();

    public Product getProductById(int id) {
        return productRepo.getById(id);
    }

    public List<Product> listProducts(){
        return productRepo.getProductList();
    }



    public void addOrder(int[] einkaufliste) throws FileNotFoundException {
        if(einkaufliste.length==0){
            throw new FileNotFoundException("Did not find any ids");
        }
        List<Product> products = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int id: einkaufliste){
            Product p = productRepo.getById(id);
            if (p == null) {
                list.add(id);
            } else {
                products.add(p);
            }
        }
        if(list.size()>0){
            throw new FileNotFoundException("Did not find: " + list.toString());
        }else{
            orderRepo.add(products);
            System.out.println("new order accept");
        }
    }



    public Order getOrderById(int n){
        return orderRepo.getById(n);
    }

    public List<Order> listOrders(){
        return orderRepo.getOrderList();
    }
}
