import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> directory = new ArrayList<BuddyInfo>();
	public void addBuddy(String name) 
	{
		directory.add(new BuddyInfo(name));
	}
	public void removeBuddy(String name) 
	{
		directory.remove(new BuddyInfo(name));
	}
}
