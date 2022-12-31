public class shuixianhua {
    public static void main(String args[]){
        int a,b,c,d,e;
        for(int i=1;i<10000;i++){
            a=i/10000;
            b=i%10000/1000;
            c=i%1000/100;
            d=i%100/10;
            e=i%10;
            if(a*a*a+b*b*b+c*c*c+d*d*d+e*e*e==i){
                System.out.println(i+"是水仙花数！");
            }
        }
    }
}
