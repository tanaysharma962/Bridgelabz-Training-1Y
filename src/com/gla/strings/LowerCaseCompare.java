package strings;
import java.util.Scanner;
public class LowerCaseCompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();
        String lm="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                c=(char)(c+32);
            }
            lm=lm+c;
        }
        String lb=s.toLowerCase();
        boolean k=true;
        if(lm.length()!=lb.length()){
            k=false;
        }
        else{
            for(int i=0;i<lm.length();i++){
                if(lm.charAt(i)!=lb.charAt(i)){
                    k=false;
                }
            }
        }
        System.out.println("Manual Uppercase: " + lm);
        System.out.println("Built-in Uppercase: " + lb);
        System.out.println("Are both same? " + k);
    }
}
