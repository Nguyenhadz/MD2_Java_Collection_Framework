package Arraylist_In_Java_Collection_Framework;

import java.util.*;

public class ProductManager {
    public void setProduct(int id, ArrayList<Product> list, String name, int price){
        for (Product product : list){
            if(product.getLocation() == id){
                product.setName(name);
                product.setPrice(price);
            }
        }
    }
    public void removeProduct(int id, ArrayList<Product> list){
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getLocation() == id){
                iterator.remove();
            }
        }
    }

    public void findProduct(String name, ArrayList<Product> list){
        for (Product product : list){
            if (product.getName().equals(name)){
                System.out.println(product);
            }
        }
    }



    public static void main(String[] args) {

        Product product1 = new Product(1, "T-shirt", 1500);
        Product product2 = new Product(2, "Pants", 2000);
        Product product3 = new Product(3, "Watch", 10000);
        Product product4 = new Product(4, "Shoe", 3000);
        Product product5 = new Product(5, "HAdz", 1000000000);

        ArrayList<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        for (Product product : list){
            System.out.println(product);
        }
        System.out.println();
        ProductManager manager = new ProductManager();

        manager.setProduct(1, list, "Ha", 100000);
        for (Product product : list){
            System.out.println(product);
        }
        System.out.println();

        manager.removeProduct(1, list);
        for (Product product : list){
            System.out.println(product);
        }
        System.out.println();

        manager.findProduct("HAdz", list);
        System.out.println();

        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(list, priceComparator);
        for (Product product : list){
            System.out.println(product);
        }
        System.out.println();
    }
}
