import java.util.Scanner;
public class cow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            System.out.println(t(n));
            n=sc.nextInt();
        }
    }
    static int t(int n){
        if(n<=4){
            return n;
        }
        return t(n-1)+t(n-3);
    }

}
