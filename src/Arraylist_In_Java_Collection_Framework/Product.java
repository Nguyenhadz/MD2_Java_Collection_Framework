package Arraylist_In_Java_Collection_Framework;

import Arrange_Comparator_Comparable.Student;

import java.util.ArrayList;

public class Product{
    private int location;
    private String name;
    private int price;
    public Product(){}
    public Product(int location, String name, int price){
        super();
        this.location = location;
        this.name = name;
        this.price = price;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Product{" +
                "id='" + location + '\'' +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                "}";
    }

}
