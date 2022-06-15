package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		String path = new String("C:\\Users\\Usuario\\Documents\\teste.txt");
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(path));
			String line = bf.readLine();
			while(line!=null) {
				String[] components = line.split(",");
				list.add(new Product(components[0],Double.parseDouble(components[1])));
				line = bf.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
			bf.close();
		}catch(IOException e) {
			System.out.println("erro");
		}
		
	}
}
