import java.util.Scanner;

public class Input {
	
	
	Scanner sc, Sc;
	//input for int values
	public int getInput (String prompt){//<-- no static belongs to the object
		System.out.print(prompt);
		sc = new Scanner(System.in);		
		return sc.nextInt();		
	}
	
	public String inPut (String prompt){
		System.out.println(prompt);
		sc = new Scanner(System.in);
		return sc.nextLine().trim().toLowerCase();
	}
	public double DubInput (String prompt){//<-- no static belongs to the object
		System.out.print(prompt);
		sc = new Scanner(System.in);		
		return sc.nextDouble();		
	}
	

}
