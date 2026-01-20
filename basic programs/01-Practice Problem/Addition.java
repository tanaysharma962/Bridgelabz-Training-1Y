import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("welcome to our addition");
		System.out.println("pls enter your first no");
		int firstNum = input.nextInt();
		System.out.println("pls enter your second no");
		int secondNum = input.nextInt();
		int sum = firstNum + secondNum;
		System.out.println("sum of you no " +sum);
		input.close();
		}
		}
		