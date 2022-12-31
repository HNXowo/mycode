import java.util.Scanner;
public class move {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int m;
        m=a[x];
        for(int j=x;j<n-1;j++){
            a[j]=a[j+1];
        }
        a[n-1]=m;
        for(int b=0;b<n;b++) System.out.print(a[b]+" ");

    }
}
