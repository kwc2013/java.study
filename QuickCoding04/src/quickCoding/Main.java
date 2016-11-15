package quickCoding;

public class Main {
	
	public static BankAccount account = new BankAccount(); 
	public static void main(String[] args) { 
 		 
		Thread depositMan = new Thread() { 
			public void run(){ 
				for(int i=0; i<10; i++) 
 				{ 
 					account.deposit(10); 
 					try { 
 						Thread.sleep((int)(Math.random()*1000)); 
 					} catch (InterruptedException e) { 
 						// TODO Auto-generated catch block 
 						e.printStackTrace(); 
 					} 
 				} 
 			} 
 		}; 
 		 
 		Thread withdrawMan = new Thread() {  
 			public void run(){ 
 				for(int i=0; i<10; i++) 
 				{ 
 					account.withDraw(10); 
 					try { 
 						Thread.sleep((int)(Math.random()*1000)); 
 					} catch (InterruptedException e) { 
 						// TODO Auto-generated catch block 
 						e.printStackTrace(); 
 					} 
 				} 
 			} 
 		};  
 		depositMan.start();  
 		withdrawMan.start(); 
 	} 
 
} 
