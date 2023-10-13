package week1.day1.assignment;

public class Mobile {
	public void makeCall()
	{
		String mobilemodel= "suzuki 120";
		float mobileweight = 200;
		System.out.println("mobile model is : "+mobilemodel);
		System.out.println("mobile weight is: "+mobileweight);
	}
		
	public void sendMsg()
	{
		boolean isfullycharged = true;
		int mobilecost = 20000;
		System.out.println("Is mobile is fully charged: "+isfullycharged);
		System.out.println("the mobile cost is :"+mobilecost);
	}
	
	public static void main(String[] args) 
	{
Mobile mobi = new Mobile();
mobi.makeCall();
mobi.sendMsg();

	}

}
/*Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */