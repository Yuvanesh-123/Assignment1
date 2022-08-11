package week2day2;

import java.util.*;
public class MissingElementsInArray {

	public static void main(String[] args) {
		
			int[] arr = {2,4,8,10,12};
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
			       int index = i *2;
			          if (arr[i] != index) {
			        	  System.out.println(index);
			        	break;
			          }
		    }
			}
}

