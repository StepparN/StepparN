import java.util.ArrayList;
import java.util.Scanner;


	public class arraylist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub¨
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Kalle"); //* På index 0
		nameList.add("XD"); //* På index 1
		nameList.add(1, "Johan"); //* På index 1 lägger till Johan
		
		for (int i = 0; i < nameList.size(); i++) {
		   System.out.println(nameList.get(i));

	}
}
}

