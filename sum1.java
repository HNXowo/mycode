import java.util.Scanner;
public class sum1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int c=a;
        for(int i=1;i<=b;i++){

            sum+=a;
            a=c+a*10;
        }
        System.out.println(sum);
    }
}
