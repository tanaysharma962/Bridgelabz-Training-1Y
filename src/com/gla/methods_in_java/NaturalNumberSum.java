package methods_in_java;
import java.util.Scanner;
public class NaturalNumberSum {
    public static long recursivesum(long n){
        if(n==1){
            return 1;
        }
        else {
            return n+recursivesum(n-1);
        }
    }
public static long formulasum(int n){
        long s=(n*(n+1))/2;
        return s;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        long r=recursivesum(n);
        long f=formulasum(n);
        if(n<=0){
            System.out.println("enter the graterthen zero ");
        }
        else {
            System.out.println("recursive sum = "+r);
            System.out.println("formula sum = "+f);
            if(r==f){
                System.out.println("Both are a equal ");
            }
            else {
                System.out.println("Both are a not equal ");
            }
        }

    }
}
