package application;

import java.util.ArrayList;
import java.util.List;

import services.ProductService;

public class Program {
	public static int globalValue = 3;

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.00));
		list.add(new Product("Mouse",900.00));
		list.add(new Product("Tablet",900.00));
		list.add(new Product("Hd Case",900.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list,p->p.getName().charAt(0)=='M');
		
		System.out.println(sum);
		
	
	}
}