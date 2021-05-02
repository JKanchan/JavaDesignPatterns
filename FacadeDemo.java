package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Mobile{
	public void modelNumber();
	public void price();
}
class Iphone implements Mobile{
	@Override
	public void modelNumber() {
		System.out.println("Iphone 11");
	}
	@Override
	public void price() {
		System.out.println("1,00,000");
	}	
}
class Oneplus implements Mobile{
	@Override
	public void modelNumber() {
		System.out.println("Nord");
	}
	@Override
	public void price() {
		System.out.println("65,000");
	}
}
class Shop{
	private Mobile iphone;
	private Mobile oneplus;
	
	public Shop() {	
		iphone = new Iphone();
		oneplus = new Oneplus();
	}
	
	public void IphoneSale() {
		iphone.modelNumber();
		iphone.price();
	}
	public void OneplusSale() {
		oneplus.modelNumber();
		oneplus.price();
	}
	
}
public class FacadeDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		System.out.print("========= Mobile Shop ============ \n");  
		System.out.print("            1. IPhone.              \n");  
		System.out.print("            2. Oneplus              \n");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		choice=Integer.parseInt(br.readLine());  

		Shop s = new Shop();
		switch(choice) {
		case 1: s.IphoneSale();
		break;
		case 2: s.OneplusSale();
		break;
		default: System.out.println("Sorry!");
		}
	}

}
