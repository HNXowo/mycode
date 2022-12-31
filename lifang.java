import java.util.Scanner;
public class lifang {
   public static void main(String args[]){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
while(num>0)
{
int n = num%10;
sum+=n*n*n;
num/=10;
}
System.out.println(sum);
   }
    
}

