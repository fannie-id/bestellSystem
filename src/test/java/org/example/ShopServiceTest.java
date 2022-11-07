package org.example;

import org.example.Model.*;
import org.example.Service.ShopService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    private ShopService shopService ;
    private List<Product> productList;
    private List<Order> orderList;
    @BeforeEach
    public  void beforeEach (){
        shopService = new ShopService();

        Product apple = new Fruit(1,"apple");
        Product orange = new Fruit(2,"orange");
        Product paper = new Stationery(3,"paper");
        Product cellphone = new Electro(4,"cellphone");
        Product pen = new Stationery(5,"pen");
        Product jack = new Mode(6,"jack");

        productList = new ArrayList<>();
        productList.add(apple);
        productList.add(orange);
        productList.add(paper);
        productList.add(cellphone);
        productList.add(pen);
        productList.add(jack);


        orderList = shopService.listOrders();
    }

    @Test
    void gib_einzel_prod_aus(){
        int index = 1;
        Product expected = productList.get(0);
        Product result = shopService.getProductById(index);
        assertEquals(expected,result);
    }

    @Test
    void list_all_products(){
        List<Product> excepted = productList;
        List<Product> result = shopService.listProducts();
        assertEquals(excepted,result);
    }

    @Test
    void list_all_orders(){
        List<Order> excepted = orderList;
        List<Order> result = shopService.listOrders();
        assertEquals(excepted,result);
    }
    @Test
    void add_order_exception_no_products(){
        int[] ids = new int[0];
        assertThatThrownBy(() -> shopService.addOrder(ids)).hasMessage("Did not find any ids");
    }
    @Test
    void add_order_exception_no_such_product(){
        int oldL = orderList.size();
        int[] ids = {7};
        assertThatThrownBy(() -> shopService.addOrder(ids)).hasMessage("Did not find: [7]");
    }


    @Test
    void add_order_successful() throws FileNotFoundException {

        int[] ids = {2,3,5};


        int oldL = orderList.size();
        System.out.println(oldL);
        shopService.addOrder(ids);
        int newL = orderList.size();
        assertTrue((newL-oldL==1));

        List<Product> list = new ArrayList<>();
        list.add(shopService.getProductById(2));
        list.add(shopService.getProductById(3));
        list.add(shopService.getProductById(5));
        Order excepted = new Order(oldL+1,list);
        assertEquals(excepted,orderList.get(newL-1));

    }


}