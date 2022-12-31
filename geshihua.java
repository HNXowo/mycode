import java.util.*;
public class geshihua {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Geshi geshi1;
        geshi1=new Geshi(a);
        System.out.println(geshi1);
    }
    static class Geshi{
        String str;
        public Geshi(String a){
            this.str=a;
            check();
        }
        public void check(){
            char a;
            String str1="";
            int b=1;
            for(int i=1;i<this.str.length();i++){
                a=this.str.charAt(i-1);
                if(this.str.charAt(i)==this.str.charAt(i-1)){
                   b++;
                }else{
                    if(b!=1){
                        str1=str1+a+b;
                        b=1;
                    }else{
                        str1=str1+a;
                    }
                }
            }
            this.str=str1;
        }
        public String toString(){
            return this.str;
        }
    }
}
