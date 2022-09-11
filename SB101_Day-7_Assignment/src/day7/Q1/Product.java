package day7.Q1;

public class Product {
	
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String productName, int price, int quantity) {
		// TODO Auto-generated constructor stub
		this.setPrice(price);
		this.setProductId(productId);
		this.setProductName(productName);
		this.setQuantity(quantity);
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	

}
