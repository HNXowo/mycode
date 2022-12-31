import java.util.*;
public class train {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int temp;
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   sum++;
                }
            }
        }
        System.out.println("最少需要"+sum+"次");
    }
}
