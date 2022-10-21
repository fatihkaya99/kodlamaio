package oop1;

//PascalCase
public class Product {

	// private 
	private String name;
	// camelCase
	private double unıtPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;// field=alan domain=iş

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnıtPrice() {
		return unıtPrice;
	}

	public void setUnıtPrice(double unıtPrice) {
		this.unıtPrice = unıtPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
