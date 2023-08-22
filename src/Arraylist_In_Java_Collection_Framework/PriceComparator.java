package Arraylist_In_Java_Collection_Framework;
import java.util.Comparator;
public class PriceComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2){
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        } else if (o1.getPrice() < o2.getPrice()){
            return -1;
        } return 0;
    }

}
