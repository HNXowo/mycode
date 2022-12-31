import java.util.Scanner;
public class SUM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        int m=sc.nextInt();
        double result=0;
        for(int i=1;i<=m;i++){
            result+=n;
            n=Math.sqrt(n);

        }
        System.out.printf("%.2f",result);

    }
}
