package core.concretes;

import Entities.concretes.Product;
import GamilManager.GmailManagerClass;
import core.abstracts.GmailManagerService;

public class GmailManagerAdapters implements GmailManagerService{

	@Override
	public void check() {
		GmailManagerClass class1 = new GmailManagerClass();
		class1.check(null);
		
		
	}

	

}
