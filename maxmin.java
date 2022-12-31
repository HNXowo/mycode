import java.util.Scanner;
public class maxmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int max1=0;
        int min1=0;
        int t;
        int m;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int min=a[n-1];
        for(int j=0;j<a.length;j++){
            if(a[j]<min)
                min=a[j];
            min1=j;
        }
        for(int x=0;x<a.length;x++){
            if(a[x]>max)
                max=a[x];
            max1=x;
        }
        t=a[0];
        a[0]=a[min1];
        a[min1]=t;
        m=a[n-1];
        a[n-1]=a[max1];
        a[max1]=m;
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
}
