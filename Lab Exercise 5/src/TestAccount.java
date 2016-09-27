
public class TestAccount {
	 public static void main(String[] args) {
		 Account a1 = new Account(12, 100.00);
		 System.out.println(a1);
		 
		 // Test Setters and Getters
		 a1.getAccountNumber();
	     a1.credit(100);
	     a1.debit(200);  
	     System.out.println(a1);  // run toString() to inspect the modified instance
	     
	     System.out.println("Balance is: " + "$" + a1.getBalance());
	     System.out.println("Account Number is: " + a1.getAccountNumber());
	     Account a2 = new Account(6000.00, 540);
	     System.out.println(a2);
	 }
}
