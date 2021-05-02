package designPattern;

import java.util.ArrayList;
import java.util.List;

interface Subject{
	 void register(Observer ob);
	 void unRegister(Observer ob);
	 void notifyObservers();
}
class DeliveryData implements Subject
{
	private List<Observer> observers;
	private String location;
	
	public DeliveryData() {
		this.observers = new ArrayList<>();
	}
	@Override
	public void register(Observer ob) {
		observers.add(ob);		
	}

	@Override
	public void unRegister(Observer ob) {
		observers.remove(ob);		
	}

	@Override
	public void notifyObservers() {
		for(Observer ob: observers)
			ob.update(location);		
	}	
	
	public void locationChanged(String location) {
		this.location = location;
		notifyObservers();
	}
}
interface Observer{
	public void update(String location);
}
class Seller implements Observer{
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}
	public void showLocation() {
		System.out.println("Hey Seller, The current location of the product is : "+location);
	}	
}
class User implements Observer{
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}
	public void showLocation() {
		System.out.println("Hey User, The current location of the product is : "+location);
	}	
}
public class ObserverDemo {

	public static void main(String[] args) {
		DeliveryData topic = new DeliveryData();
		
		Observer ob1 =  new User();
		Observer ob2 =  new Seller();
		
		topic.register(ob1);
		topic.register(ob2);
		
		topic.locationChanged("Bangalore");
		
	}
}
