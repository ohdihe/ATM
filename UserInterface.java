package atm;

import java.util.Scanner;

public class UserInterface {
	Scanner sc, Sc;
	//Singleton
	private static UserInterface instance = new UserInterface();
	public static UserInterface getInstance(){
		return instance;
	}
	public int IntInput(String prompt){
		System.out.print(prompt);
		sc = new Scanner(System.in);		
		return sc.nextInt();		
	}
	
	public String stringInput(String prompt){
		System.out.println(prompt);
		sc = new Scanner(System.in);
		return sc.nextLine().toUpperCase();
	}
	public double DoubleInput(String prompt){
		System.out.print(prompt);
		sc = new Scanner(System.in);		
		return sc.nextDouble();		
	}

}
