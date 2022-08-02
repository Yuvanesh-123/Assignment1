package week1day1;

public class Mymobile {
	public void  ShareDocument(){
System.out.println("Doucment Shared");	
 
	}
	public void sendMessage () {
System.out.println("Message Sent");	
 
	}
	public void Call() {
System.out.println("Calling");	
 
	}
public static void main(String[] args) {
	Mymobile function=new Mymobile();
	function.Call();
	function.sendMessage();
	function.ShareDocument();
}
}
