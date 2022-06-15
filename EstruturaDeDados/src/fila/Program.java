package fila;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila<Integer> f = new Fila<>(9);
		f.enfileira(1);
		f.enfileira(3);
		f.enfileira(5);
		System.out.println(f.estaVazia());
		System.out.println(f.toString());
		System.out.println(f.espiar());
		f.desenfileira();
		System.out.println(f.espiar());
		f.desenfileira();
		System.out.println(f.espiar());
		System.out.println(f.toString());
	}

}
