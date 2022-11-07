package org.example.Repo;

import org.example.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;


    public ProductRepo() {
        Product apple = new Product(1,"apple");
        Product orange = new Product(2,"orange");
        Product paper = new Product(3,"paper");
        Product cellphone = new Product(4,"cellphone");
        Product pen = new Product(5,"pen");
        Product jack = new Product(6,"jack");

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
