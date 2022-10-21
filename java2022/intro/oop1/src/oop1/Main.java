package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		// Product product=getProductById(); GERÇEK HAYATTA FRONTEND

		Product product1 = new Product(); // klas tanımlama klasların ebeveyni object
		product1.setName("Delonghi Kahve");
		product1.setDiscount(7);
		product1.setUnıtPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// set value atama
		// get (okuma)
		// System.out.println(product1.name);
		// source format düzensizse düzenle
		Product product2 = new Product();
		product2.setName("Smeg Kahve");
		product2.setDiscount(7);
		product2.setUnıtPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		// get (okuma)
		Product product3 = new Product();
		product3.setName("Kitchen Kahve");
		product3.setDiscount(7);
		product3.setUnıtPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		// get (okuma)

		// []array;
		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");// html
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");

		}
		System.out.println("</ul>");
		 IndividualCustomer individualCustomer=new IndividualCustomer();
		 individualCustomer.setId(1);
		 individualCustomer.setPhone("05222");
		 individualCustomer.setCustomerNumber("12345");
		 individualCustomer.setFirstName("Fatih");
		 individualCustomer.setLastName("Kaya");
		 
		 CorporateCustom corporateCustomer=new CorporateCustom();
		 corporateCustomer.setId(2);
		 corporateCustomer.setCompanyName("Kodlama.io");
		 corporateCustomer.setCustomerNumber("54321");
		 corporateCustomer.setTaxNumber("1111");
		 corporateCustomer.setPhone("0533333");
		 
         Customer[] customers = {individualCustomer,corporateCustomer};//oop inheritance extend edersen ötekine gelir.değer ve referans tipleri
		 
		 
		 
		 
		 

	}

}
