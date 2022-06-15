package entidades;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withDrawLimit;
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getInitialBalance() {
		return balance;
	}
	
	
	public double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance +=amount;
	}

	public Account(int number, String holder, double initialBalance, double withDrawLimit) throws Exception {
		if(initialBalance<0 || withDrawLimit<0) {
			throw new Exception("Valor inválido");
		}
		this.number = number;
		this.holder = holder;
		this.balance = initialBalance;
		this.withDrawLimit = withDrawLimit;
	}
	
	public void withDraw(double amount) {
		try {
		if(amount>this.balance ) {
			throw new Exception("u dont have this amount in your account!");
		}
		if(amount>this.withDrawLimit) {
			throw new Exception("the amount is higher than your withdraw limit");
		}
		this.balance -= amount;
		System.out.println("New Balance: "+ this.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
}
