import java.lang.constant.Constable;
import java.util.*;
public class jinzhi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Change change;
        int n=sc.nextInt();
        change=new Change(n);
        System.out.println(change.zhuan());
    }
    static class Change{
        private int shi;
        public Change(int n){
            shi=n;
        }
        public String zhuan(){
            String base="";
            int sys=0;
            while(true){
                sys=shi%2;
                shi=shi/2;
                base=sys+base;
                if(shi<2){
                    sys=shi%2;
                    base=sys+base;
                    break;
                }
            }
            return base;
        }
    }
}
