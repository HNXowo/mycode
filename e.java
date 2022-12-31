
public class e {
    public static void main(String[] args){
        double a=1;
        double b=1;
        double c=1;
        double sum=0;
        int n=10000;
        for(int i=1;i<=n+1;i++){
            a=1/c;
            c=c*b;
            b++;
            sum=sum+a;
        }
        System.out.printf("%.8f",sum);
    }
}
