import java.util.*;
public class Inversion {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int []a=new int[x];
         int n=a.length%2;
         int temp;
         for(int i=0;i<a.length;i++){
             a[i]=sc.nextInt();
         }

         for(int i=0;i<a.length/2;i++){
                 temp=a[i];
                 a[i]=a[a.length-i-1];
                 a[a.length-i-1]=temp;
         }
         for(int v:a){
             System.out.println(v);
         }
    }
}

