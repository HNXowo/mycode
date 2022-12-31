import java.util.Scanner;
public class defen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        double get=0,max=0,min=0,result=0,score;
            for(i=1;i<=n;i++){
                get=sc.nextDouble();
                result+=get;
                if(get>max){
                    result-=max;
                    max=get;
                }else{
                    if(get<min){
                        result-=min;
                        min=get;
                    }
                }
            }  
            score=result/n;
            System.out.println("该选手的最终得分是"+score);
    }
}
