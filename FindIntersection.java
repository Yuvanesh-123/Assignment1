package week2day2;

public class FindIntersection {

	public static void main(String[] args) {
	int [] num1= {1,2,3,4,5,6,7,8};
	int [] num2= {9,55,33,66,1,2,3,4,8};
	for (int i = 0; i < num1.length; i++) {
		for (int j = 0; j < num2.length; j++) {
			if(num1[i]==num2[j])
			{
				System.out.println(num1[i]);
			}
		}
	}
	
	
	}
}
