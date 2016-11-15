package quickCoding;

public class BankAccount { 
 	 
 	private int balance = 100; 
 	 
 	public int getBalance() { 
 		return balance; 
 	} 
 	 
 	public synchronized void withDraw(int amount) { 
		balance -= amount; 
 		System.out.println(amount + " ��ŭ ���		���� : " +balance); 
 	} 
 	 
 	public synchronized void deposit(int money) {  
 		balance += money; 
 		System.out.println(money + " ��ŭ �Ա�              ���� : " +balance); 
 	} 
 	 
 } 
