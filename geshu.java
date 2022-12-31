import java.util.Scanner;
public class geshu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,a,b,c;
        a=0;
        b=0;
        c=0;
        for(i=1;i<=n;i++){
            double get=sc.nextDouble();
            if(get<0)a++;
            if(get==0)b++;
            if(get>0)c++;
        }
        System.out.println("正数有"+c+"个");
        System.out.println("零有"+b+"个");
        System.out.println("负数有"+a+"个");
    }
}

    

