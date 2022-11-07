package org.example.Repo;

import org.example.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;


    public ProductRepo() {
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
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getById(int n){

        for(Product p:productList){
            if(p.getId()==n){
                return p;
            }
        }
        return null;
    }


}
