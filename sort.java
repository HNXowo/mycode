import java.util.Scanner;
public class sort {
    public static void main(String[] args){
        double []a=new double[10];
        double t;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextDouble();
        }
        int x=1;
        for(int b=0;b<a.length-1;b++){
            if(a[b]>=a[b+1]){
                x=0;
                break;
            }
        }
        if (x==0){
            System.out.println("NO");
            for(int i=0;i<a.length;i++){
                for(int j=1;j<a.length-i;j++){
                    if(a[j]<a[j-1]){
                        t=a[j];
                        a[j]=a[j-1];
                        a[j-1]=t;

                    }
                }
            }
        }else{
            System.out.println("YES");
        }

        for (int c=0;c<a.length;c++) {
            System.out.print(a[c] + " ");
        }
    }
}
