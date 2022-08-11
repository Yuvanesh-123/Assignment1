package week2day2;


public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number  =56;
		int positiveNumber ;
		int NegativeNumber;
		if(number<0) {
			positiveNumber =number*(-1);
				System.out.println("The  number is negative, now its converted into +ve  =  "+positiveNumber);
			}
			if(number>0) 
				{
				NegativeNumber=number*(-1);
               System.out.println("The  number is positive, now its converted into -ve  =  "+NegativeNumber);
			}
			
		else {
			System.out.println(" The given number is  positive number, try another number");
		}
			

	}

}
