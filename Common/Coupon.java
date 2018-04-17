import java.io.Serializable;

public class Coupon implements Serializable{
	private String name;
	private String store;
	private double value;
	
	public Coupon() {
		name = null;
		store = null;
		value = 0;
	}
	
	public Coupon(String _name, String _store, double _value) {
		name = _name;
		store = _store;
		value = _value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStore() {
		return store;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setName(String s) {
		String First;
		String Last;
		
		Last = s.substring(0, s.indexOf(", "));
		First = s.substring(s.indexOf(", ") + 2);
		
		name = First + " " + Last;
	}
	
	public void setStore(String s) {
		store = s;
	}
	
	public void setValue(double i) {
		value = i;
	}
}
