import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String a=sc.next();
        String b=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(a.equals(str.charAt(i))) 
                System.out.printf("%s ",b);
            else System.out.printf("%s ",str.charAt(i));
        }
    }
}