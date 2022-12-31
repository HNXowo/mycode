import java.util.*;
public class math {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        MyMath math;
        math=new MyMath(a,b,c);
        System.out.println(math.max());
        System.out.println(math.min());
        System.out.println(math.average());
    }
    static class MyMath{
        int a,b,c;
        public MyMath(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public int max(){
            int max=0;
            if(this.a>max){
                max=this.a;
            }
            if(this.b>max) {
                max = this.b;
            }
            if(this.c>max){
                max=this.c;
            }
            return max;
        }
        public int min(){
            int min=0;
            if(this.a<min){
                min=this.a;
            }
            if(this.b<min) {
                min = this.b;
            }
            if(this.c<min){
                min=this.c;
            }
            return min;
        }
        public float average(){
            float average;
            average=(this.a+this.b+this.c)/3;
            return average;
        }
    }
}
