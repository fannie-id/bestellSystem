package org.example.Model;



public class Fruit extends ProductImpl {

    public Fruit(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
