package org.example.Model;



public class Mode extends ProductImpl {

    public Mode(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Mode{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
