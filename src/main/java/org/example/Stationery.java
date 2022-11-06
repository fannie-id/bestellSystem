package org.example;

public class Stationery extends ProductImpl{
    public Stationery(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
