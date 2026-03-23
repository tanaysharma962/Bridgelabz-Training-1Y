package strings;
import java.util.Scanner;
public class ChararrayCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        char arr1[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr1[i]=s.charAt(i);
        }
        char arr2[]=s.toCharArray();

        boolean k=true;
        if(arr1.length!=arr2.length){
            k=false;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    k=false;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println(k);
    }
}
