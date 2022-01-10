package business.concretes;

import java.util.regex.Pattern;

import Entities.concretes.Product;
import GamilManager.GmailManagerClass;
import business.abstracts.ProductService;
import dataAcces.abstracts.ProductDao;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private GmailManagerClass class1;
	
	

	String trueEmail;
	String trueParala;
	String emailRegex = "^(.+)@(.+)\\.(.+)$";
	Pattern pattern = Pattern.compile(emailRegex);

	public ProductManager(ProductDao productDao, GmailManagerClass class1) {
		super();
		this.productDao = productDao;
		this.class1 = class1;
	}

	@Override
	public void üyeol(Product product) {
		
		
		
		if (product.getFirtName().length()<2 ) {
			
			System.out.println("isminiz ve soyadınız iki harten az olamaz, lütfen bilgilerinizi kontrol ediniz.");
			return;
		}
		
		
		else if (product.getLastName().length()<2) {
			
			System.out.println("isminiz ve soyadınız iki harten az olamaz, lütfen bilgilerinizi kontrol ediniz.");
			return;
			
		}
	
		else if (product.getParola().length()<5) {
			System.out.println("parolanız 6 karekterden az olamaz.lütfen bilgilerinizi kontrol ediniz.");
					
			
			
			return;
						
		}
		
		
		
		else if((pattern.matcher(product.getEmail()).matches()==false)) {
			
			
				

			System.out.println("lüften e-mail adresinizin doğruluğunu kontrol ediniz");
			
		}
		
		else if((pattern.matcher(product.getEmail()).matches()==true)) {
			
			System.out.println("e-mail adresinize doğrulama e-maili gönderildi, bağlantıyı tıklayarak adresinizin doğruluğunu sağlayınız ");
			this.class1.check(emailRegex);
				
			}
			
		
		
	else {
			
			System.out.println("adınız, soyadınız, emailiniz ve parolanız kayıt edildi");
		}
		
		
		
	}

	@Override
	public void üyegüncelle(Product product) {
		System.out.println("üyelik bilgileri güncellendi...");
		
	}

	@Override
	public void sistemeGiris(Product product) {
		
		if (product.getParola().length()>6 && pattern.matcher(product.getEmail()).matches()==true) {
			
			
			System.out.println("sisteme başarı ile giriş yaptınız");
			
		}
		else {
			System.out.println("sisteme girişiniz gerçekleşmedi, email ve ya parola bilginiz yanlıştır. ");
			
		}
		
	}

}
