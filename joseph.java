import java.util.*;
public class joseph {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("请输入从第k位开始报数");
        int k=sc.nextInt();
        int peopleleft=n;
        int m=k-1;
        int count=0;
        while(peopleleft>1){
            if(a[m]==0){
                count++;
                if(count==3){
                    a[m]=1;
                    count=0;
                    peopleleft--;
                }
            }
            m++;
            if(m==a.length){
                m=0;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
