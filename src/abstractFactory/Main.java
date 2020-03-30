package abstractFactory;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.Properties;
import java.lang.Class;



import adidas.AdidasFactory;
import boss.BossFactory;

public class Main {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Class adi = null;
		Class bos = null;
		Vaate clothes = null;
	    	Vaate clothes2 = null;
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("factory.properties"));
		
		adi = Class.forName(properties.getProperty("factory"));
		bos = Class.forName(properties.getProperty("factory2"));
		
		clothes = (Vaate)adi.newInstance();
		clothes2 = (Vaate)bos.newInstance();

	 
		
	Engineer Jasper_old = new Engineer(clothes);
	Jasper_old.listaaVaatteet();
	
	System.out.println();
	Engineer Jasper = new Engineer(clothes2); 
	Jasper.listaaVaatteet();
	
}
}
