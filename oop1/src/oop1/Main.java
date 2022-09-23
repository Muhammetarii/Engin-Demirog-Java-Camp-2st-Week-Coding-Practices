package oop1;

public class Main {

	public static void main(String[] args) {
		String message = "Vade oranı";
		// Class değişkeni oluşturmanın yöntemi budur.
		// Bütün class ların ebeveyni olup, onlara Object denir.
		// Class a ait nitelik tanımlama işlemi değer atama olup set value dir.
		// get (okuma ) işlemidir.

		Product productOne = new Product();
		productOne.setName("Delonghi kahve makinesi");
		productOne.setDiscount(7);
		productOne.setUnitPrice(7500);
		productOne.setUnitPrice(3);
		productOne.setImageUrl("img1.jpg");

		Product productTwo = new Product();
		productTwo.setName("Smeg kahve makinesi");
		productTwo.setDiscount(10);
		productTwo.setUnitPrice(5500);
		productTwo.setUnitPrice(10);
		productTwo.setImageUrl("img2.jpg");

		Product productThree = new Product();
		productThree.setName("Kitchen kahve makinesi");
		productThree.setDiscount(5);
		productThree.setUnitPrice(5000);
		productThree.setUnitPrice(5);
		productThree.setImageUrl("img3.jpg");

		Product[] products = { productOne, productTwo, productThree };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>"); 
	}

}
