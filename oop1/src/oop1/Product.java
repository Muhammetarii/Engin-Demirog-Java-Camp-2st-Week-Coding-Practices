package oop1;

//Class isimlendirmeleri PascalCase olarak yazılır.
public class Product {
	// Class'a ait field lar camelCase olarak yazılır.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	// private sadece o class ın için kullanılır demektir.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
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
