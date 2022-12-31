import java.util.*;
public class chabing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int []a=new int[z];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int []b=new int[x];
        for(int j=0;j<b.length;j++){
            b[j]=sc.nextInt();
        }
        int []c=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(b[j]==a[i]){
                    a[i]=0;
                    b[j]=0;
                    break;
                }
            }
        }
        for(int m=0;m<a.length;m++){

            if(a[m]!=0){
                c[m]=a[m];
            }
        }

        for(int n=0;n<b.length;n++){
            if(b[n]!=0){
                c[a.length+n]=b[n];
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                System.out.println(c[i]);
            }
        }
}

}

