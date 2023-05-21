import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }

    public List<Product> getProductByPlace(String place) {
        List<Product> prod = new ArrayList<>();
        // for (Product p : products) {
        // if (p.getPlace().equals(place))
        // prod.add(p);

        // }
        // return prod;

        // Using Stream API
        prod = products.stream().filter(pro -> pro.getPlace().toLowerCase().equals(place.toLowerCase())).collect(Collectors.toList());
        return prod;
    }

    public List<Product> outofWarrantyProduct(int warranty) {
        List<Product> prod = new ArrayList<>();
        // for (Product p : products) {
        //     if (p.getWarranty() < warranty)
        //         prod.add(p);

        // }
        // return prod;

        // Using Stream API Concept
        prod = products.stream().filter(p->p.getWarranty()<
        warranty).collect(Collectors.toList());
        return prod;

    }

}
