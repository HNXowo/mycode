import java.util.*;
public class fangcheng {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        Equation equation1;
        EquationDemo equationDemo1;
        equation1=new Equation(a,b,c);
        equationDemo1=new EquationDemo(a,b,c);
        System.out.println(equationDemo1);
        System.out.println(equation1);
    }
    static class Equation{
        float A,B,C;
        double ROOT1,ROOT2;
        public Equation(float a,float b,float c){
            this.A=a;
            this.B=b;
            this.C=c;
            solving();
        }
        public int rootType(){
            int n;
            if(this.B*this.B-4*this.C*this.A<0){
               n=0;
            }else{
                if(this.ROOT1==this.ROOT2){
                    n=1;
                }else{
                    n=2;
                }
            }
            return n;
        }
        void solving(){
            double root1= (-this.B+Math.sqrt(this.B*this.B-4*this.A*this.C))*1/(2*this.A);
            double root2= (-this.B-Math.sqrt(this.B*this.B-4*this.A*this.C))*1/(2*this.A);
            this.ROOT1=root1;
            this.ROOT2=root2;
        }
        public String toString(){
            if(this.rootType()!=0){
                return "实根是："+this.ROOT1+"和"+this.ROOT2;
            }
            return "没有实根！";
        }
    }
    static class EquationDemo{
        String answer;
        float a,b,c;
        public EquationDemo(float a,float b,float c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public String toString(){
            this.answer=a+"x*x"+"+"+b+"x"+"+"+c+"的结果是";
            return this.answer;
        }
    }
}
