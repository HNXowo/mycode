import java.util.Scanner;
public class tongji {
    public static void main(String args[]){
        int i=1,j=1;
        int result=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&n<=100){
             while(i<=n){
            result=result+j;
            i++;
            j=j+i;
            }
            System.out.print(result);
        
        }else{
            System.out.print("请输入1-100间的数字！");

        }
       
        
    }
}
