package designPattern;

interface Notification{
	void notifyUser();
}
class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Email Notification");		
	}	
}

class SMSNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification");
	}	
}
class NotificationFacoty{
	
	public Notification createNotification(String channel) {
		if(channel.equalsIgnoreCase("Email"))
			return new EmailNotification();
		else if(channel.equalsIgnoreCase("SMS"))
			return new SMSNotification();
		else
			return null;		
	}	
}
public class FactoryDemo {

	public static void main(String[] args) {
		NotificationFacoty nf = new NotificationFacoty();
		Notification n = nf.createNotification("Email");
		n.notifyUser();
		
		Notification n1 = nf.createNotification("SMS");
		n1.notifyUser();

	}

}
