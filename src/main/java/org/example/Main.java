package org.example;


import org.example.Service.ShopService;

public class Main {
    public static void main(String[] args) {


        ShopService shopService = new ShopService();
        System.out.println(shopService.getProductById(7));

        System.out.println("---------------------");
        System.out.println(shopService.listProducts());

        System.out.println(shopService.listOrders());

        int[] einkaufsliste = {2,3,6,7,8};
        shopService.addOrder(einkaufsliste);

        System.out.println(shopService.getOrderById(1));

        System.out.println(shopService.listOrders());

    }


}