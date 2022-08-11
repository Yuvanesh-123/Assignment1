package week2day2;

import java.util.*;


public class Anagram {

//	public static void main(String[] args) {
	//String text="test leaf";
//	String text2="leaf test";
	
//	if(text.length()==text2.length()){
//		System.out.println("lenght is same  "+text.length());
//	}
//	else
//	{
	//		System.out.println("length is not same");
	//}
	
	//}
	
	//public static void main(String[] args) {
	//String text="Post";
	//String text2="Stop";
    // char[] care=text.toCharArray();{
    //System.out.println("text one");
    	//}
    //for (int i = 0; i < care.length; i++) {
    	// System.out.println(care[i]);
  
    // }
    // char[] care2=text2.toCharArray();{
    	//    	System.out.println( " text 2");
    	//  }
    //for (int i = 0; i < care2.length; i++) {
    	//System.out.println(  care2[i]);
    //}
//}
	public static void main(String[] args) {
		String text="stop";
		String text2="post";

		char[] charArray = text.toCharArray();
		char[] charArray2 = text2.toCharArray();
Arrays.sort(charArray);
Arrays.sort(charArray2);

		System.out.println(charArray);	
		System.out.println(charArray2);	
		
		if(Arrays.equals(charArray, charArray2)) {
			System.out.println("the given String is Anagram");
		}else {
			System.out.println("the given String is not  Anagram");
		}
		
		
		
		
	
	}
}