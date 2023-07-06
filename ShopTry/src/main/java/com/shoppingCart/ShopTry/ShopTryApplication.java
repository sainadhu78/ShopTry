package com.shoppingCart.ShopTry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopTryApplication implements CommandLineRunner{

	@Autowired
	DaoProduct data;
	
	public static void main(String[] args) {
		SpringApplication.run(ShopTryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String str1="/images/brinjal.jpg";
		String str2="/images/tomato.jpg";
		String str4="/images/carrot.jpeg";
		String str3="/images/onion.jpg";
		String str5="/images/cauliflower.jpg";
		String str6="/images/cucumber.jpg";
		String str7="/images/green chilli.jpg";
		String str8="/images/potato.jpg";
		String str9="/images/apple.jpg";
		String str10="/images/banana.jpg";
		String str11="/images/oranges.jpg";
		String str12="/images/pomogrante.jpg";
		data.addNewProduct(new Product(1,"Brinjal",str1,5,23));
		data.addNewProduct(new Product(2,"Brinjal II ",str1,62,32));
		data.addNewProduct(new Product(3,"Tomato",str2,10,25));
		data.addNewProduct(new Product(4,"Cauliflower",str5,9,29));
		data.addNewProduct(new Product(5,"Tomato II ",str2,30,29));
		data.addNewProduct(new Product(6,"Onion",str3,65,22));
		data.addNewProduct(new Product(7,"Carrot",str4,50,15));
		data.addNewProduct(new Product(8,"Cucumber",str6,23,29));
		data.addNewProduct(new Product(9,"Green Chilli ",str7,12,34));
		data.addNewProduct(new Product(10,"Potato",str8,20,25));
		data.addNewProduct(new Product(11,"Apple",str9,80,50));
		data.addNewProduct(new Product(12,"Banana",str10,50,63));
		data.addNewProduct(new Product(13,"Oranges",str11,55,23));
		data.addNewProduct(new Product(14,"Pomogrante",str12,36,56));
	}

}
