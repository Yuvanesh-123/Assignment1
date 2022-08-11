package week2day2;
import java.util.*;
public class OddIndexToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lowerCase word");
		String text=sc.next();
	char[] r = text.toCharArray();
	for (int i = 0; i <= r.length; i++) {
		if(i%2 == 0) {
			char rec=r[i];
//	 char uppercase=Character.toUpperCase(rec);
			char uppercase = Character.toUpperCase(rec);
	 System.out.print(uppercase);
		}else {
			System.out.print(r[i]);
		}
	}
	}
}