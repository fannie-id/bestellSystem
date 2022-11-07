package org.example.Model;

public class ProductImpl implements Product{
    private int id;
    private String name;

    public ProductImpl() {
    }

    public ProductImpl (int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductImpl{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
