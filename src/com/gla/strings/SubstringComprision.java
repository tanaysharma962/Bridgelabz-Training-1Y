package strings;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SubstringComprision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string is : ");
        String str=sc.nextLine();
        System.out.println("enter the starting index : ");
        int s=sc.nextInt();
        System.out.println("enter the ending index : ");
        int e=sc.nextInt();

        int a=0;
        String sub1="";
        for(int i=s;i<e;i++){
            sub1=sub1+str.charAt(i);
        }
        String sub2=str.substring(s,e);

        if(sub1.length()!=sub2.length()){
            a=1;
        }
        else{
            for(int i=0;i<sub1.length();i++){
                if(sub1.charAt(i)!= sub2.charAt(i)){
                    a=1;
                }
            }
        }
        System.out.println(sub1);
        System.out.println(sub2);
        if(a==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
