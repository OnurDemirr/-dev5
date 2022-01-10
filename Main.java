import Entities.concretes.Product;
import GamilManager.GmailManagerClass;
import business.abstracts.ProductService;
import business.concretes.ProductManager;

import dataAcces.abstracts.ProductDao;
import dataAcces.concretes.HebernetProductDao;

public class Main {

	public static void main(String[] args) {
		ProductService  productService = new ProductManager(new HebernetProductDao()  ,new GmailManagerClass());	
		
		Product product = new Product("onur", "1234", "onurr.fee@gmail.com", "34mgeaür3");
		
		
		productService.üyeol(product);
		productService.sistemeGiris(product);
		productService.üyegüncelle(product);
		
		
		

	}

}
