import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.addProduct(new Product("Apple", "laptop", "White Table", 22));
        productService.addProduct(new Product("Aces", "laptop", "Black Table", 22));
        productService.addProduct(new Product("HP", "laptop", "Black Table", 22));
        productService.addProduct(new Product("Lenovo", "laptop", "ground", 22));
        productService.addProduct(new Product("Compacaq", "laptop", "ground", 22));
        productService.addProduct(new Product("DELL", "laptop", "ground", 22));
        productService.addProduct(new Product("Microsoft", "laptop", "ground", 22));
        productService.addProduct(new Product("Acer", "laptop", "ground", 22));

        List<Product> plist = productService.listAllProduct();
        List<Product> productBasedOnName = productService.listBasedOnText("black");

        for(Product p: productBasedOnName){
            System.out.println(p);
        }

        }
    }
