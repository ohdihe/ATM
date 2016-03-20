package atm;

public class Verification {
	protected int UserPin;
	protected int UserPinLength;
	protected int StandardPinLenght = 1000;
	protected int StandardLength;
	protected boolean legal = true;
	
	Singleton singleton = Singleton.getInstance();
		
	int VerifyYourSelf(){
		while(legal){
			try{
				UserPin = singleton.UI.IntInput("ENTER YOUR PIN: ");
				
				StandardLength = String.valueOf(StandardPinLenght).length();//to get the number of ints in the variable
				UserPinLength = String.valueOf(UserPin).length();//to get the number of ints in the variable
				
				//to make sure only four digits is entered by user.
				if (UserPinLength != StandardLength){
					System.out.println("Please enter 4 digits pin");
				}else{
					//here it will check if pin is in database and produce user name.
					//calling the database method
					singleton.database.LocateAndApprove(UserPin);
					legal = false;
				}
			}catch(Exception e){
				System.out.println("Please check pin again and re-enter correct digits");
			}
		}

		return UserPin;
	}

}
