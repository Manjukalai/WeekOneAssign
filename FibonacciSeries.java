package week1.day2.assignemnt;

public class FibonacciSeries {

	public static void main(String[] args) {
int firstNum=0, range=8,secNum=1,sum;
System.out.println("first number is : "+firstNum);

for(int i=0;i<=range-1;i++)
	{
	
	sum=secNum+firstNum;
	
	
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
	
}

}

}
