import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("mleko", 3.5));
        products.add(new Product("czekolada", 4.5));
        products.add(new Product("maslo", 6));
        products.add(new Product("jogurt", 2.2));

        Collections.sort(products);
        System.out.println(products);
        Product p1 = new Product("mleko", 3.5);
        Product p2 = new Product("czekolada", 4.5);
        int por = p1.compareTo(p2);
        System.out.println(por);
    }
}
