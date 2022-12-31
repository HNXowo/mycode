import java.util.*;
public class guolv {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++) {

            if (a[i] < 60) {
                a[i] = 0;
            }

        }
        for(int x=0;x<a.length;x++){
            if(a[x]!=0)
            System.out.println(a[x]);
        }
    }
}
