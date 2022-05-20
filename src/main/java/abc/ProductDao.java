package abc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProductDao {
	
	private static final String SQL_SELECT_ALL = "SELECT product_id, product_name, price FROM products ORDER BY product_id";
	private static final String SQL_INSERT = "INSERT INTO products (product_name, price) VALUES ( ?, ?)";
	private static final String SQL_SELECT_WHERE_PRODUCT_ID = "SELECT * FROM products WHERE product_id = ?";

	private Connection con;
	public ProductDao(Connection con) {
		this.con = con;
	}
	public List<Product>findAll(){
		List<Product> list = new ArrayList<Product>();
		
		try (PreparedStatement stmt = con.prepareStatement(SQL_SELECT_ALL)){
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Product p = new Product(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("price"));
				list.add(p);
			}
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}
	
	public Product findByProductId(String productId) {
		int productIdint = Integer.parseInt(productId);
		   try (PreparedStatement stmt = con.prepareStatement(SQL_SELECT_WHERE_PRODUCT_ID)) {
			   
			   stmt.setInt(1, productIdint);
		        
		        ResultSet rs = stmt.executeQuery();
		        
		        if (rs.next()) {
		            return new Product(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("price"));
		        }
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		   return null;
	}
	
    public void register(Product product) {
	try (PreparedStatement stmt = con.prepareStatement(SQL_INSERT)) {

        stmt.setString(1, product.getProductName());
        stmt.setInt(2, product.getPrice());
        stmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

  }
   

}
