import java.util.Scanner;
public class score {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int i,j;
        j=0;
        double result=0,get;
            for(i=1;i<=10;i++){
                get=sc.nextDouble();
                result+=get;
                if(get<60){
                    j++;
                }

            }
        System.out.println(result/10);
        System.out.println(j);
    }

    
}
