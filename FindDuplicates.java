package week2day2;

import java.util.Iterator;

public class FindDuplicates {
/*	public static void main(String[] args) {
		int[] num= {12,34,56,78,90,12,34,78,};
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) 
				if(num[i]==num[j]) {
				System.out.println("Duplicates in Array is "+num[i]);
			}
			
		}
		
	}*/
	public static void main(String[] args) {
		String[] text= {"java is java  complete java"};
		for (int i = 0; i < text.length; i++) {
			for (int j = i+1; j < text.length; j++) {
				if(text[i]==text[j]) {
					System.out.println("Duplicates in Array is "+text[i]);
				}else {
					System.out.println("not excuting");
				}
				
			}
			
		}
	}

				
	
}
