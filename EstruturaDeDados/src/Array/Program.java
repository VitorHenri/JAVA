package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
//		Vetor<Integer> vet = new Vetor<>(3);
//		
//		vet.adiciona(1);
//		vet.adiciona(2);
//		vet.adiciona(7);
////		vet.adiciona("Elemento 4");
////		vet.adiciona("Elemento 5");
//		System.out.println(vet.getTamanho());
//
//		System.out.println(vet.busca(1));
//		System.out.println(vet);
//		System.out.println(vet.busca(2));
//		vet.adiciona(1, 1);
//		System.out.println(vet);
//		vet.remove(1);
//		System.out.println(vet);
		
		
		ArrayList<Integer> array = new ArrayList();
		array.add(1);
		System.out.println(array.contains(1));
		System.out.println(array.indexOf(2));
		System.out.println(array.get(0));
		List<Integer> a = Arrays.asList(1,2,3,4,5,6);
		String teste = "Kg";
		System.out.println(teste);
		
	}
}
