import java.util.Scanner;
public class prime2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(p(i)==0)
                System.out.println(i);
        }
    }
    static int p(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return 1;
        }
        return 0;
    }
}
