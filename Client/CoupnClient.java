import java.rmi.*;
import java.util.Scanner;

public class CoupnClient {
	public static void main(String[] args) {
		try {
			System.out.println("Running Coupon Client...");
		
			java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(1113);
			CouponMachine c = (CouponMachine) registry.lookup("coup");
			
			Boolean done = false;
			Scanner scanner = new Scanner(System.in);
			String name, storename;
			double value;
			
			System.out.println(c.getWelcome());
			
			while(done == false) {
				name = null;
				value = 0;
				storename = null;
				
				System.out.println("Enter your name (LastName, FirstName): ");
				name = scanner.nextLine();
				
				System.out.println("Enter the name of the store: ");
				storename = scanner.nextLine();
				
				System.out.println("Enter the value of your coupon: ");
				value = scanner.nextDouble();
				
				c.createCoupon(name, storename, value);
				
				System.out.println("Coupon for " + c.getCouponName() + " from " + c.getCouponStore() + ". Amount: " + c.getCouponValue());
				
				scanner.nextLine();
			}
		
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
