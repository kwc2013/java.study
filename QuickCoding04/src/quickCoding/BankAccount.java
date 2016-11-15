package quickCoding;

public class BankAccount { 
 	 
 	private int balance = 100; 
 	 
 	public int getBalance() { 
 		return balance; 
 	} 
 	 
 	public synchronized void withDraw(int amount) { 
		balance -= amount; 
 		System.out.println(amount + " 만큼 출금		총합 : " +balance); 
 	} 
 	 
 	public synchronized void deposit(int money) {  
 		balance += money; 
 		System.out.println(money + " 만큼 입금              총합 : " +balance); 
 	} 
 	 
 } 
