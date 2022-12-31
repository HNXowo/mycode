import java.util.Scanner;
public class rhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("请输入一个奇数整数！");
            n=sc.nextInt();
        }else{
            int up=n/2+1;
            int down=n/2;
            for(int i=1;i<=up;i++){
                for(int j=up-1;j>=i;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
            for(int i=down;i>=1;i--){
                for(int j=down;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }


}
