import java.util.Scanner;
public class average1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] a=new double[10];
        double sum=0;
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (double v : a) {
            sum = sum + v;
        }
    System.out.println("平均成绩是"+sum/a.length);
    }
}
