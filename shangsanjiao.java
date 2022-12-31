import java.util.*;
public class shangsanjiao {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i][j]!=0){
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}
