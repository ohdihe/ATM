package atm;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
	
	UserInterface UI = UserInterface.getInstance();
	Database database = Database.getInstance();
	Submenu submenu = Submenu.getInstance();

}
