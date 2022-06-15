package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Usuario\\Documents\\teste.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		List<Product> list = new ArrayList<>();
		String[] object = br.readLine().split(",");

		while (object != null) {
			list.add(new Product(object[0], Double.parseDouble(object[1])));
			object = br.readLine().split(",");
		}
		
		double avg = list.stream().map(p->p.getPrice()).reduce(0.0,(x,y)->x+y / list.size());
		
	}
}
