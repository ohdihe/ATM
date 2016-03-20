package atm;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
//import java.util.Set;

public class Database {
	private static Database instance = new Database();
	public static Database getInstance(){
		return instance;
	}
	//dictionary
	Map<Integer, String> UserInfo = new HashMap<Integer, String>();
	Map<Integer, Double> CheckingAccBalance = new HashMap<Integer, Double>();
	Map<Integer, Double> SavingAccBalance = new HashMap<Integer, Double>();
	boolean cardOwnerName = false;
	//double CheckingBalance;
	//double SavingBalance;

	//This is to make sure the card user is in the bank's database.
	void LocateAndApprove (int cardPin){
		UserInfo.put(4444, "Shane Mosely");
		UserInfo.put(1243,"Jennifer Miller");
		UserInfo.put(2345, "Mimi Niche");
		
		//money each members currently have in their checking account
		CheckingAccBalance.put(4444, 500.00);
		CheckingAccBalance.put(1243, 5500.00);
		CheckingAccBalance.put(2345, 700.00);
		
		//money each members currently have in their saving account
		SavingAccBalance.put(4444, 440.00);
		SavingAccBalance.put(1243, 1500.00);
		SavingAccBalance.put(2345, 900.00);
		
		for (int key : UserInfo.keySet()){
			if(UserInfo.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == cardPin){
				System.out.println("WELCOME\n" + UserInfo.get(key));
				System.out.println("\nLoading your preference......");
				cardOwnerName = true;
			}
		}
		//if the user pin don't match with any key in the database then something is up
		if (!cardOwnerName){
			System.out.println("Please visit our local branch nearest to you.\nGOODBYE!");
		}
		
		
	}
	
	//This is the checking account balance for each individual member.
	void ViewCheckingAccount(int Pin){
		for (int key : UserInfo.keySet()){
			if(CheckingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
				System.out.println("Checking Account Balance is " + CheckingAccBalance.get(key));					
			}
		}
		//return CheckingBalance;
		
	}
	//checking deposit 
	void DepositToChecking(int Pin, double moneyToDeposit){
		for (int key : UserInfo.keySet()){
			if(CheckingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
			   CheckingAccBalance.put(key, CheckingAccBalance.get(key)+moneyToDeposit);			
			}
		}
	}
	//checking withdraw
	void WithdrawFromChecking(int Pin, double moneyToWithdraw){
		for (int key : UserInfo.keySet()){
			if(CheckingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
			   CheckingAccBalance.put(key, CheckingAccBalance.get(key) - moneyToWithdraw);			
			}
		}
	}
	
	//This is the saving account balance for each individual member
	void ViewSavingAccount(int Pin){
		
		for (int key : UserInfo.keySet()){
			if(SavingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
				System.out.println("Saving Account Balance is " + SavingAccBalance.get(key));
			}
		}
		
	}
	
	void DepositToSaving(int Pin, double moneyToDeposit){
		for (int key : UserInfo.keySet()){
			if(SavingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
			   SavingAccBalance.put(key, SavingAccBalance.get(key)+moneyToDeposit);	
			 
			}
		}
	}
	void WithdrawFromSaving(int Pin, double moneyToWithdraw){
		for (int key : UserInfo.keySet()){
			if(SavingAccBalance.isEmpty()){
				System.out.println("Empty");
			}
			//if the user pin matches with the key in the database
			if(key == Pin){
			   SavingAccBalance.put(key, SavingAccBalance.get(key) - moneyToWithdraw);	
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
