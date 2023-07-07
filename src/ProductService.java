import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductService {

    List<Product> products = new ArrayList<>();
     public void addProduct(Product p){
         products.add(p);
     }

     public List<Product> listAllProduct(){
         return products;
     }

     public List<Product> listBasedOnText(String text){
         String str = text.substring(0, 1).toUpperCase() + text.substring(1);
         System.out.println(str);
         List<Product> prods = new ArrayList<>();
          for( Product p : products){
              if(p.getPlace().contains(str) || p.getPlace().equals(str)){
                  prods.add(p);
              }

          }
          return prods;
     }


}
