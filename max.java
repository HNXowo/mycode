import java.util.Scanner;
public class max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int max=0;
        int max1=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            if(a[j]>max)
                max=a[j];
            max1=j;
        }
        System.out.println("最大值是"+max1+"号"+max);
    }

}
