import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Pankaj Kumar");
		set.add("jatan Veer");
		set.add("Neeraj kumar");
		set.add("Pankaj Kumar");
		for (String string : set) {
			System.out.println(string);
		}
		//set.get(); In Setthere is no Get() present
		System.out.println(set.contains("Pankaj Kumar"));
	}
}
