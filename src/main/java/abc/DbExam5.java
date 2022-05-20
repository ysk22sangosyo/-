package abc;
import java.util.List;
public class DbExam5 {
    public static void main(String[] args) {
        
    	ProductDao productDao = new ProductDao(DbUtil.getConnection());
        Product p1 = new Product(null,"ボールペン",200);        
        productDao.register(p1);
        
        
        List<Product> list = productDao.findAll();
        for(Product a :list) {
        System.out.println("product_id:" + a.getProductId()+ ",product_name:" + a.getProductName()+",price:" + a.getPrice());
        }
    }
}