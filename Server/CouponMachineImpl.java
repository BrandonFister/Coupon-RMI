import java.rmi.*;
import java.rmi.server.*;

public class CouponMachineImpl extends UnicastRemoteObject implements CouponMachine{
	private Coupon coupon;
	private String welcomeMessage;
	
	public CouponMachineImpl() throws RemoteException {
		coupon = new Coupon();
	}
	
	public CouponMachineImpl(String nameString, String storeString, double val) throws RemoteException {
		coupon = new Coupon();
	}
	
	public String getCouponName() throws RemoteException {
		return coupon.getName();
	}
	
	public String getCouponStore() throws RemoteException {
		return coupon.getStore();
	}
	
	public double getCouponValue() throws RemoteException {
		return coupon.getValue();
	}
	
	public void createCoupon(String fullName, String storeName, double value) throws RemoteException {
		coupon.setValue(value);
		coupon.setStore(storeName);
		coupon.setName(fullName);
	}
	
	public void setWelcome(String w) throws RemoteException {
		welcomeMessage = w;
	}
	
	public String getWelcome() throws RemoteException {
		return welcomeMessage;
	}
}
