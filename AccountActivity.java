package atm;

public class AccountActivity {
	Singleton singleton = Singleton.getInstance();
	protected boolean legal = true;
	protected boolean good = true;
	protected double AmountToWithdraw;
	protected double AmountToDeposit;

	enum Accounts {
		CHECKINGS,SAVINGS,QUIT
	};
	Accounts withDraw;
	Accounts Deposit;
	Accounts View;

	
	void WithdrawChoice(int UserPin){
		while(legal){
			try{
				AmountToWithdraw = singleton.UI.DoubleInput("Enter Amount: ");
				legal = false;
			}catch (Exception e){
				System.out.println("Please enter correct amount");
			}
		}
		singleton.submenu.WithdrawMenu();
	
		while(withDraw != Accounts.QUIT){
			while(good){
				try{
					//This is how to use enum with user integer inputs.
					withDraw = Accounts.values()[singleton.UI.IntInput("What do you want to do: ")];
					good = false;
				}catch (Exception e){
					System.out.println("That is a wrong selection. Please Select again!");
				}
			}
				switch (withDraw) {
				case CHECKINGS:
					singleton.database.WithdrawFromChecking(UserPin, AmountToWithdraw);
					break;
				case SAVINGS:
					singleton.database.WithdrawFromSaving(UserPin, AmountToWithdraw);
					break;
				case QUIT:
					System.out.println("Exiting To Main Menu\n");
					singleton.submenu.PreferenceMenu();
					break;
				default:
					System.out.println("Please check again");
					break;
				}
			
		}
	}
		
		
	
	void DepositChoice(int UserPin){
		while(legal){
			try{
				AmountToDeposit = singleton.UI.DoubleInput("Enter Amount: ");
				legal = false;
			}catch (Exception e){
				System.out.println("Please enter correct amount");
			}
		}
		singleton.submenu.DepositMenu();
		while(Deposit != Accounts.QUIT){
			while (good){
				try{
					//This is how to use enum with user integer inputs.
					Deposit = Accounts.values()[singleton.UI.IntInput("What do you want to do: ")];
					good = false;
				}catch (Exception e){
					System.out.println("That is a wrong selection. Please Select again!");
				}
			}
				switch (Deposit) {
				case CHECKINGS:
					singleton.database.DepositToChecking(UserPin, AmountToDeposit);
					break;
				case SAVINGS:
					singleton.database.WithdrawFromSaving(UserPin, AmountToDeposit);
					break;
				case QUIT:
					System.out.println("Exiting To Main Menu\n");
					singleton.submenu.PreferenceMenu();
					break;
				default:
					System.out.println("Please check again");
					break;
				}
		}
	
}
	
	void ViewChoice(int UserPin){
		singleton.submenu.ViewMenu();
		while(View != Accounts.QUIT){
			while(good){
				try{
					//This is how to use enum with user integer inputs.
					View = Accounts.values()[singleton.UI.IntInput("What do you want to do: ")];
					good = false;
				}catch (Exception e){
					System.out.println("That is a wrong selection. Please Select again!");
				}
			}
				switch (View) {
				case CHECKINGS:
					singleton.database.ViewCheckingAccount(UserPin);;
					break;
				case SAVINGS:
					singleton.database.ViewSavingAccount(UserPin);
					break;
				case QUIT:
					System.out.println("Exiting To Main Menu\n");
					singleton.submenu.PreferenceMenu();
					break;
				default:
					System.out.println("Please check again");
					break;
				}
			
		}
	}
	
	
	
}