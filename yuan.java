import java.util.*;
public class yuan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        double g=sc.nextDouble();
        double h=sc.nextDouble();
        Money money1,money2,money3;
        money1=new Money(a,b,c);
        money2=new Money(d,e,f);
        money3=new Money(g);
        System.out.println(money1.add(money2));
        System.out.println(money1.cut(money2));
        System.out.println(money3.add(h));
    }
    static class Money{
        int yuan,jiao,fen;
        double money;
        public Money(int a,int b,int c){
            this.yuan=a;
            this.jiao=b;
            this.fen=c;

        }
        public void sum(){
            this.money=this.yuan+(double)this.jiao/10+(double)this.fen/100;
        }
        public void change(){
            if(this.fen>=10){
                this.jiao++;
                this.fen-=10;
            }
            if(this.jiao>=10){
                this.yuan++;
                this.jiao-=10;
            }
            if(this.fen<0){
                this.fen+=10;
                this.jiao--;
            }
            if(this.jiao<0){
                this.jiao+=10;
                this.yuan--;
            }
        }
        public Money(double x){
            this.yuan=(int)x;
            this.jiao=(int)((x-(int)x)*10);
            this.fen=(int)((x*100)%10);
        }
        Money add(double x){
            return this.add(new Money(x));
        }
        Money add(Money x){
            this.yuan=this.yuan+x.yuan;
            this.fen=this.fen+x.fen;
            this.jiao=this.jiao+x.jiao;
            change();
            sum();
            return Money.this;
        }
        Money cut(Money x){
            this.yuan=this.yuan-x.yuan;
            this.jiao=this.jiao-x.jiao;
            this.fen=this.fen-x.fen;
            change();
            sum();
            return Money.this;
        }
        public String toString(){
            return "结果是"+this.money;
        }
    }
}
