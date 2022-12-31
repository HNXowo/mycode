import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println(find(x));
    }
    static String find(String a){
        String str;
        String str2="";
        str=a;
        int x=0;
        int count=0;
        int left,right;
        for(int i=0;i<str.length();i++){
            left=i;
            right=str.indexOf(str.charAt(i));
            if(right==-1||right>left){
                continue;
            }else{
                int c=0;
                int m=0;
                for(int j=left;j<(right+left)/2;j++){
                    if(str.charAt(j)!=str.charAt(right-c)){
                        m=1;
                        break;
                    }
                    c++;
                }
                if(c==(right+left)/2&&m==0){
                    count=right-left+1;
                    if(count>x){
                        x=count;
                        str2=str.substring(left,right);
                    }
                }
            }
        }
        return str2;
    }
}
