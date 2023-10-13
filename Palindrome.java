package week1.day2.assignemnt;

public class Palindrome {

	public static void main(String[] args) {
int num = 34543,reverse=0,remainder;
int temp=num;
while(temp>0)
{
	remainder=temp%10;
	reverse=reverse*10+remainder;
	temp=temp/10;
}
System.out.println(reverse+" is a reversed number");

if(temp==reverse)
{
System.out.println(num+" is a Palindrome");
}
else
{
	System.out.println(num+" is not a Palindrome");
}
	}

}
