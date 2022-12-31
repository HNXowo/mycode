import java.util.Scanner;
public class chaifen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int j;
        while(i<=n){
            j=n-i;
            System.out.println(i+"+"+j+"="+n);
            i++;
        }


    }
}
