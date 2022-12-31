import java.util.Scanner;
public class three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max1=0;
        int max2=0;
        int max3=0;
        for(int i=1;i<=n;i++){
            int get=sc.nextInt();
            if(get>max1){
                max1=get;
            }else{
                if(get<max1&get>max2){
                    max2=get;
                }else{
                    if(get>max3&get<max2){
                        max3=get;
                    }
                }
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
