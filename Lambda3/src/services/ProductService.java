package services;

import java.util.List;
import java.util.function.Predicate;

import application.Product;

public class ProductService {
	public double filteredSum(List<Product> list,Predicate<Product> pre) {
		double sum =0;
			for(Product p : list) {
				if(pre.test(p))
					sum+=p.getPrice();
			}
			return sum;
	}
}
