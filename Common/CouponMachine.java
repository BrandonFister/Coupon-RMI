import java.rmi.*;

public interface CouponMachine extends Remote{

	public String getCouponName() throws RemoteException;
	public String getCouponStore() throws RemoteException;
	public double getCouponValue() throws RemoteException;
	public void createCoupon(String fullName, String storeName,double value) throws RemoteException;
	public void setWelcome(String w) throws RemoteException;
	public String getWelcome() throws RemoteException;
}
