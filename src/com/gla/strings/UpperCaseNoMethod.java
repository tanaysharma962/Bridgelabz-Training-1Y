package strings;
import java.util.Scanner;
public class UpperCaseNoMethod {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        String um="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                c=(char)(c-32);
            }
            um=um+c;
        }
        String ub=s.toUpperCase();

        boolean k=true;

        if(um.length()!=ub.length()){
            k=false;
        }
        else{
            for(int i=0;i<um.length();i++){
                if(um.charAt(i)!=ub.charAt(i)){
                    k=false;
                }
            }
        }
        System.out.println("Manual Uppercase: " + um);
        System.out.println("Built-in Uppercase: " + ub);
        System.out.println("Are both same? " + k);
    }
}
