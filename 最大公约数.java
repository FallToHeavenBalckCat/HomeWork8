import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.printf("%d",gcd(a,b));
    }
    
    public static int gcd(int a,int b){
        return b!=0?gcd(b,a%b):a;
    }
}