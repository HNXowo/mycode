import java.util.Scanner;
public class award {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int x=0;
        int close=0;
        double get;
        boolean flag=false;
        double key=Math.random()*10000;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(a[j]==key){
                flag=true;
                x++;
            }
        }
        if(!flag){
            for(int j=0;j<n;j++){
                if(Math.abs(a[j]-key)<Math.abs(close-key)){
                    close=a[j];
                    x=1;
                }else{
                    if(Math.abs(a[j]-key)==Math.abs(close-key)){
                        x++;
                    }
                }
            }
        }
        get=key/x;
        System.out.println("有"+x+"人得到奖金"+"奖金是"+get);
    }
}
