package week2day2;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the Word to check (Palindrome) ");
		Scanner sc=new Scanner(System.in);
		String text= sc.next();
String rev="";
char[] charArray = text.toCharArray();
for (int i = charArray.length;i<=0 ;i--) {
	rev=rev+charArray[i];
}if (text.equals(rev)) {
	System.out.println( text+"  Word is palindrome" );
}else {
	System.out.println( text+"  Word is not palindrome" );
}
	}

}
