import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] strs=sc.nextLine().split(" ");
        for(int i=strs.length-1;i>-1;i--)
        {
            System.out.printf("%s ",strs[i]);
        }
    }
}