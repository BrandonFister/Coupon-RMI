import java.rmi.*;
import java.rmi.server.*;

public class CouponServer {
	public static void main(String[] args) {
		
		try {
			
			String s = "Welcome to the coupon machine!!";
			
			System.out.println("Starting Coupon Service...");
			
			CouponMachineImpl c = new CouponMachineImpl();
			c.setWelcome(s);
			
			System.out.println( "Binding remote object to RMI registry" );
			
			java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1113);
			registry.rebind("coup", c);
			
			System.out.println("Waiting for coupon info");
			
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
