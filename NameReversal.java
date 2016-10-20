import java.util.*;

public class NameReversal {

	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name1 = name.nextLine();
		String nameReverse = "";
		int asdf=name1.length();
		
		for (int a=0;a < asdf; a++) {
			int b=asdf-a-1;
			nameReverse += name1.substring(b,b+1).toLowerCase();
					}
		System.out.print(nameReverse);

	}

}
