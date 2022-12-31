public class tongji1 {
    public static void main(String[] args){
        int n=(int)(Math.random()*100+1);
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*1500000000+1);
        }
        long []b=new long[1500000000];
        for(int i=1;i<=1500000000;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    b[i]++;
                }
            }
        }
        for(int j=0;j<b.length;j++){
            if(b[j]!=0){
                System.out.println(j+"出现了"+b[j]+"次");
            }
        }
    }
}
