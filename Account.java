

public abstract class Account {
	Input enter = new Input ();
		
	double withdrawal(double balance){	
		double withdraw = 0.0;
		
		while (true){
			withdraw = enter.DubInput("Enter amount to withdraw: ");
			if (withdraw < balance){
				balance -= withdraw;
				break;
			}else{
				System.out.println("Invalid operation!!!");
			}
			
		}
		
		System.out.println("Balance is now $" + balance);
		return balance;
	}
	double deposit(double balance){
		double deposit = 0.0;
		while (true){
			deposit = enter.DubInput("Enter amount to deposit: ");
			if (deposit > 0){
				balance += deposit;
				break;
			}else{
				System.out.println("Invalid operation!!!");
			}
			
		}
		
		System.out.println("Balance is now $" + balance);
		return balance;		
		
	}
	
	void checkBalance(double balance){
		System.out.println("Your balance is $" + balance);
		
	}
		
	
}


class SavingAccount extends Account{
	BankMenu BM = new BankMenu();
	Input select = new Input();
	double SavingBalance = 200;
	public void viewSavingAcc(){
		BM.SavingMenu();
		int choice = 0;
		while (choice != 4){
			try{
				choice = select.getInput("Enter your Selection: ");			
				switch(choice){
				case 1:
					super.checkBalance(SavingBalance);
					break;
				case 2:
					SavingBalance = super.deposit(SavingBalance);
					break;
				case 3:
					SavingBalance = super.withdrawal(SavingBalance);
					break;
				case 4:
					System.out.println("Exiting to MAIN MENU.....");
					BM.mainMenu();
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

class CheckingAccount extends Account{
	BankMenu BM = new BankMenu();
	Input select = new Input();
	double CheckingBalance = 300;
	public void viewCheckingAcc(){
		BM.CheckingMenu();
		int choice = 0;
		while (choice != 4){
			try{
				choice = select.getInput("Enter your Selection: ");			
				switch(choice){
				case 1:
					super.checkBalance(CheckingBalance);
					break;
				case 2:
					CheckingBalance = super.deposit(CheckingBalance);
					break;
				case 3:
					CheckingBalance = super.withdrawal(CheckingBalance);
					break;
				case 4:
					System.out.println("Exiting to MAIN MENU.....");
					BM.mainMenu();
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

class BusinessAccount extends Account{
	BankMenu BM = new BankMenu();
	Input select = new Input();
	double BusinessBalance = 500;
	public void viewBusinessAcc(){
		BM.BusinessMenu();
		int choice = 0;
		while (choice != 4){
			try{
				choice = select.getInput("Enter your Selection: ");			
				switch(choice){
				case 1:
					super.checkBalance(BusinessBalance);
					break;
				case 2:
					BusinessBalance = super.deposit(BusinessBalance);
					break;
				case 3:
					BusinessBalance = super.withdrawal(BusinessBalance);
					break;
				case 4:
					System.out.println("Exiting to MAIN MENU.....");
					BM.mainMenu();
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








