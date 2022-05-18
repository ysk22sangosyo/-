package abc;


public class Product {
	private Integer productId;
	private String productName;
	private Integer price;
	
	public Product () {
		
	}
	public Product(Integer productId,String productName,Integer price) {
		this.productId = productId;
	    this.productName = productName;
	    this.price = price;
	}
	public Integer getProductId() {
	    return productId;
	}

	public void setProduct_id(Integer productId) {
	    this.productId = productId;
	}

	public String getProductName() {
	    return productName;
	}

	public void setProduct_name(String productName) {
	    this.productName = productName;
	}

	public Integer getPrice() {
	    return price;
	}

	public void setPrice(Integer price) {
	    this.price = price;
	}

}
