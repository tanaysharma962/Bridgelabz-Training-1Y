import java.util.Scanner;
public class CheckBy5{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the no");
	int number= input.nextInt();
	if(number % 5==0){
		System.out.println("number is divisible by 5");
		}
		System.out.println("is the number" +number +"\n" +
		"divisible by 5 "+ number);
	}
}