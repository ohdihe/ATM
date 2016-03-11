


public class Option {
	//This is the instantiation of the classes.
	BankMenu BM = new BankMenu();
	SavingAccount SA = new SavingAccount();
	CheckingAccount CA = new CheckingAccount();
	BusinessAccount BA = new BusinessAccount();
	
	Input In = new Input();

	
	public void begin() {
		int Userin = 0;
		System.out.println("Welcome to Bank of Odidi \n");
		BM.mainMenu();
		
		while (Userin != 4){
			try{
				Userin = In.getInput("Enter choice: ");				
				switch(Userin){
				case 1:
					SA.viewSavingAcc();
					break;
				case 2:
					CA.viewCheckingAcc();
					break;
				case 3:
					BA.viewBusinessAcc();
					break;
				case 4:
					System.out.println("Thank you\nGOODBYE!");
					break;
				default:
					System.out.println("Invalid Input!");
								
				}
			}catch (Exception e){
				System.out.println("That is a wrong selection. Select again!");
			}		
			
		}
		
		
	}
			
			
		
	

}
