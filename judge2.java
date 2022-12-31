import java.util.*;
public class judge2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Judgement str1;
        str1=new Judgement(a);
        System.out.println(str1);
    }
    static class Judgement{
        String str;
        int ischeck=0;
        public Judgement(String a){
            this.str=a;
            check();
        }
        public void check(){
            int x;
            int judgestr1=0;
            int judgestr2=0;
            int judgestr3=0;
            String str1;
            String str2="0123456789";
            String str3="0123456789abcdefghijklmnopqrstuvwxyz_$";
            x=this.str.indexOf(".");
            if(x==-1){
                this.ischeck=0;
            }else{
                str1=this.str.substring(x);
                if(str1.equals(".java")){
                    judgestr1=1;
                }
                if(str2.indexOf(this.str.charAt(0))==-1){
                    judgestr2=1;
                }
                for(int j=0;j<this.str.indexOf(".");j++){
                    if(str3.indexOf(this.str.charAt(j))==-1){
                        judgestr3=1;
                        break;
                    }
                }
                if(judgestr1==1&&judgestr2==1&&judgestr3==0){
                    this.ischeck=1;
                }
            }
        }
        public String toString(){
            if (this.ischeck==1){
                return "true";
            }else{
                return "false";
            }
        }
    }
}
