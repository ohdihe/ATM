package atm;

public class PreferenceActivity {
	
	Verification v = new Verification();
	protected int UserPin = v.VerifyYourSelf();
	protected boolean legal = true;
	AccountActivity Activity = new AccountActivity();
	
	Singleton singleton = Singleton.getInstance();
	
	enum Preference {
		WITHDRAW, DEPOSIT, BALANCE, QUIT
	};
	Preference choice;//enum variable.
	
	void begin(){
		singleton.submenu.PreferenceMenu();
		while(choice != Preference.QUIT){
			while (legal){
				try{
					//This is how to use enum with user integer inputs.
					choice = Preference.values()[singleton.UI.IntInput("Enter Your Selection: ")];
					legal = false;
				}catch (Exception e){
					System.out.println("That is a wrong selection. Please Select again!");
				}
			  
			}			
				switch (choice) {
				case WITHDRAW:
					Activity.WithdrawChoice(UserPin);
					break;
				case DEPOSIT:
					Activity.DepositChoice(UserPin);
					break;
				case BALANCE:
					Activity.ViewChoice(UserPin);
					break;
				case QUIT:
					System.out.println("GOODBYE\n");
					break;
				default:
					System.out.println("That is an invalid choice");
					break;
				}
			
		}
		
	}

}
