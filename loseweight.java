import java.util.*;
public class loseweight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Lose lose1;
        lose1=new Lose(a);
        System.out.println(lose1);
    }
    static class Lose{
        String str;
        public Lose(String a){
            this.str=a;
        }
        public void check(){
            String str1="abc";
            int b=0;
            int c=0;
            for(int i=0;i<this.str.length();i++){
                int a=0;
                for(int j=0;j<str1.length();j++){
                    if (this.str.charAt(0)==str1.charAt(j)){
                        a=1;
                        break;
                    }
                }
                if(a==0){
                    this.str=this.str.substring(1);
                }else{
                    if(this.str.charAt(0)==this.str.charAt(1)){
                        this.str=this.str.substring(1);
                    }else{
                        b=1;
                        break;
                    }
                }
            }
            for(int i=this.str.length()-1;i>=0;i--){
                int a=0;
                for(int j=0;j<str1.length();j++){
                    if (this.str.charAt(this.str.length()-1)==str1.charAt(j)){
                        a=1;
                        break;
                    }
                }
                if(a==0){
                    this.str=this.str.substring(0,this.str.length()-2);
                }else{
                    if(this.str.charAt(this.str.length()-1)==this.str.charAt(this.str.length()-2)){
                        this.str=this.str.substring(0,this.str.length()-2);
                    }else{
                        b=1;
                        break;
                    }
                }
            }
        }
        public String toString(){
            check();
            return this.str;
        }
    }
}
