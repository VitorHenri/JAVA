package Pilha;

import java.util.Stack;

public class Program {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha(10);
		System.out.println(pilha);
		System.out.println(pilha.getTamanho());
		pilha.empilha(1);
		System.out.println(pilha);
		System.out.println(pilha.getTamanho());
		System.out.println(pilha.estaVazia());
		pilha.empilha(7);
		pilha.empilha(8);
		System.out.println(pilha.topo());
		
		Stack<Integer> stack = new Stack();
		
		
	}
}
