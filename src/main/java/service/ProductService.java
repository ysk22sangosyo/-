package service;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

import abc.DbUtil;
import abc.Product;
import abc.ProductDao;
public class ProductService {
	


	 public Product findById(String productId) {
	        try (Connection conn = DbUtil.getConnection()) {
	        	ProductDao productDao = new ProductDao(conn);
	        	Product product = productDao.findByProductId(productId);

	            return product;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return null;
    }

	 public List<Product> authentication() {
	        try (Connection conn = DbUtil.getConnection()) {
	        	ProductDao productDao = new ProductDao(conn);
	          List<Product> list = productDao.findAll();

	            return list;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return null; 
	    }   
		public List<Product> find() {
			try (Connection conn = DbUtil.getConnection()) {
			ProductDao productDao = new ProductDao(conn);
				return productDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			}

			return Collections.emptyList();
		}

	}
