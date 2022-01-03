package AccountManipulation;

import java.util.Scanner;

public class Main {
	public static void main() {
		Scanner sc=new Scanner(System.in);
Account ac;
		System.out.println("customerid");
		int a=sc.nextInt();
		System.out.println("customername");
		String s=sc.next();
		System.out.println("emailid");
		String s2=sc.next();
		System.out.println("accountnum");
		int acn=sc.nextInt();
		System.out.println("balance");
		double b=sc.nextDouble();
		System.out.println("minimum");
		double c=sc.nextDouble();
		System.out.println("amount");
		int d=sc.nextInt();
		Customer cs=new Customer(a,s,s2);
		Account a1=new SavingsAccount(acn,cs,b,c);
		boolean bl=a1.withdraw(d);
		if(bl==true) {
			System.out.println("Successful"+a1.getBalance());
		}else {
			System.out.println("Withdraw not possible"+a1.getBalance());
		}
	    
		}public static void main(String[] args) {
			main();
			
		}

}
