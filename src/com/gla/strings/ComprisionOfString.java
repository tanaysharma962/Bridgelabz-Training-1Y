package strings;
import java.util.Scanner;
public class ComprisionOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string 1 ");
        String s1=sc.nextLine();
        System.out.println("enter the string 2 ");
        String s2=sc.nextLine();

        if(s1.length()!=s2.length()){
            return;
        }

        int a=0;
        int b=0;
        for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)!=s2.charAt(i)){
               a=1;
           }
        }
        if(!s1.equals(s2)){
            b=1;
        }
        if(a==b){
            System.out.println("Both methods give the SAME result.");
        }
        else{
            System.out.println("Both methods give DIFFERENT results.");
        }
    }
}
