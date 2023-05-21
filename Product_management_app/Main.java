import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // 1. Add all the product in list

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));


        // 2. print all the product

        // System.out.println("All product list");
        // List<Product> products = service.getAllProducts();
        // for (Product p : products) {
        //     System.out.println(p);
        // }


        // System.out.println("============================================================================================");
        
        // 3. print particular product base on the product name

        // System.out.println("a Particular product");
        // Product p = service.getProduct("Apple Mouse");
        // System.out.println(p);


        // System.out.println("============================================================================================");
        
        // 4. print product particular text 

        // System.out.println("a Particular text");
        // List<Product> prods = service.getProductWithText("black");
        // for (Product product : prods) {
        //     System.out.println(product);
        // }


        // System.out.println("============================================================================================");

        // 5. print product base on place

        // System.out.println("base on place");
        // List<Product> place = service.getProductByPlace("Black Table");
        // for (Product productByPlace : place) {
        //     System.out.println(productByPlace);
        // }


        // System.out.println("============================================================================================");

        // 6. print product base on the product out of warranty

        System.out.println("List of product out of warranty");
        List<Product> outofWarranty = service.outofWarrantyProduct(2023);
        for (Product Warranty : outofWarranty) {
            System.out.println(Warranty);
        }

    }
}
