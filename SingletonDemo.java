package designPattern;

import java.io.Serializable;

class Singleton implements Cloneable, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Singleton s = new Singleton();
	
	public static Singleton getSingletonInstance() {
		return s;
	}
	private Singleton() {		
	}
	
	//to protect cloning
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	// to protect Serialization
	public Object readResolve() {
		return s;
		
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s = Singleton.getSingletonInstance();
		try {
			s.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning is not supported");
		}
		

	}

}
