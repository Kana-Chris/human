package jp.co.diworks.action;

public class Human {
	
	public static void main(String[]args) {
		
		HumanName abc = new HumanName();
		System.out.println(abc.getName());
		
		HumanAge egf = new HumanAge();
		System.out.println(egf.getAge());
		
		HumanAddress hij = new HumanAddress();
		System.out.println(hij.getAddress());
	}
}
