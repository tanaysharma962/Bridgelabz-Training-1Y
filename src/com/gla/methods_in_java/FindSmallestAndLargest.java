package methods_in_java;
import java.util.Scanner;
public class FindSmallestAndLargest {
    public static int largest(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int smallest(int a,int b,int c){
        if(a<b&&a<c){
            return a;
        }
        else if(b<c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();
        System.out.println("enter the third number ");
        int c = sc.nextInt();
        int l = largest(a,b,c);
        int s = smallest(a,b,c);
        System.out.println("largest = "+l);
        System.out.println("Smallest = "+s);
    }
}
