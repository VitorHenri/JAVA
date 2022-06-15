package util;

import java.util.function.Predicate;

import application.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		
		return t.getPrice()>=100.0;
	}

}
