import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private static List<BuddyInfo> directory = new ArrayList<BuddyInfo>();
	public AddressBook() 
	{
		
	}
	public static void addBuddy(BuddyInfo obj) 
	{
		directory.add(obj);
	}
	public static void removeBuddy(int index) 
	{
		if (index >= directory.size()| index < 0) 
		{
			System.out.println("Index out of range.");
		}
		else 
		{
			directory.remove(index);
		}
	}
	public static void main(String[] args) 
	{
		BuddyInfo test = new BuddyInfo("Rhys");
		addBuddy(test);
		removeBuddy(0);
		//test change
	}
}
