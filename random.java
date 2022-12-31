import java.util.Scanner;
public class random{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=(int)(Math.random()*20);
        b=(int)(Math.random()*20);
        System.out.printf("%d+%d=",a,b);

    }     
    
}
