package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;// jdbc hibernate umrunda olmasın
	private Logger[] loggers;//java util

	public ProductManager(ProductDao productDao,  Logger[] loggers) {//loose coupling =gevşek bağlılık
		this.productDao = productDao;
		this.loggers =loggers;//this yoksa kendine en yakın loggera
	}
	//dependency injection

	public void add(Product product) throws Exception {// response request pattern (istek yanıtlama)
		// business rules(iş kuralları)
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		productDao.add(product);
		for (Logger logger : loggers) {//[db,mail]
			logger.log(product.getName());
		}

	}

}















//interface:onu implemente  eden sınıfın, newinı instance kısacası referansını tutabilir.
// Bir katman başka bir katmanın (entity hariç)klasını kullanıyorken sadece
// interface erişiminı kurmalı
//bad code örneği
//JdbcProductDao productDao = new JdbcProductDao();
// HibernateProductDao productDao = new HibernateProductDao();
// interface
// ProductDao productDao = new HibernateProductDao();// geçen derste customer
// örneği
