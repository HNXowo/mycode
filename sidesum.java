import java.util.*;
public class sidesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum;
        for(int x:a[0]){
            sum1+=x;
        }
        for(int x:a[n-1]){
            sum2+=x;
        }
        for(int i=1;i<a.length-1;i++){
            sum3+=a[i][0]+a[i][m-1];
        }
        sum=sum1+sum2+sum3;
        System.out.println(sum);
    }
}
