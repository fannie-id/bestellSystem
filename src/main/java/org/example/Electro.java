package org.example;

public class Electro extends ProductImpl {

    public Electro(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Electro{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

}
