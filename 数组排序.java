import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sort(a,l,r);
        for(int i=0;i<n;i++) System.out.printf("%d ",a[i]);
    }
    
    public static void sort(int[] a,int l,int r){
        Arrays.sort(a,l,r+1);
    }
}