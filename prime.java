import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0&b==0)
                break;
            int i;
            int flag=0;
            for(i=a;i<=b;i++){
                int get=i*i+i+41;
                if(t(get)==0)flag=1;

            }
            if(flag==1)
                System.out.println("Sorry");
            else
                System.out.println("OK");

        }
    }
    static int t(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                return 0;
        }    return 1;


    }


}
