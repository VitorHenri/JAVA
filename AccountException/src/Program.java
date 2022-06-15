import java.util.Scanner;

import entidades.Account;

public class Program {

	public static void main(String[] args) {
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a number");
		int numberAccount =  input.nextInt();
		System.out.println("Type a name");
		String name = input.next();
		System.out.println("initial balance");
		double initialBalance = input.nextDouble();
		System.out.println("withDraw Limit ");
		double withDrawLimit = input.nextDouble();
		
		Account ac1 = new Account(numberAccount, name, initialBalance, withDrawLimit);
		System.out.println("Enter the amount for withdraw");
		ac1.withDraw(input.nextDouble());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
