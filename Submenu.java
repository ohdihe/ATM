package atm;

public class Submenu {	
	private static Submenu instance = new Submenu();
	public static Submenu getInstance(){
		return instance;
	}
	
	void PreferenceMenu(){
		System.out.println("To Withdraw Enter 0");//-> how much and from which account
		System.out.println("To Deposit Enter 1");//-> how much and to what account
		System.out.println("To View Balance Enter 2");//-> what account
		System.out.println("To QUIT Enter 3");
	}
	void WithdrawMenu(){
		System.out.println("To withdraw from Checking Account Enter 0");
		System.out.println("To withdraw from Saving Account Enter 1");
		System.out.println("To return to the Main Menu Enter 2");
		System.out.println();
	}
	void DepositMenu(){
		System.out.println("To Deposit to Checking Account Enter 0");
		System.out.println("To Deposit to Saving Account Enter 1");
		System.out.println("To return to the Main Menu Enter 2");
		System.out.println();
	}
	void ViewMenu(){
		System.out.println("To View Checking Account Balance Enter 0");
		System.out.println("To View Saving Account Balance Enter 1");
		System.out.println("To return to the Main Menu Enter 2");
		System.out.println();
	}

}
