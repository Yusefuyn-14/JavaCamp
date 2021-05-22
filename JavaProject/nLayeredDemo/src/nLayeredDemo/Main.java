package nLayeredDemo;

import nLayeredDemo.DataAccess.concretes.TestProductDao;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO: Spring IoC ile çözülecek.
		ProductService productService = new ProductManager(new TestProductDao(),
				new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
