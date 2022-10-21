package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception { // Katmanlı Mimari 6.10.2022 package into package
		Product product1 = new Product(1, "Iphone Xr", 10000); // arayüz işbirliği
		
		Logger [] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};//iptalde burdan herşey burdan kasmayın beni 
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);

	}

}
