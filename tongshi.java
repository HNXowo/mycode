
public class tongshi {
    public static void main(String[] args){
        int[]a={2,4,5,6,7,8,9,10};
        int[]b={3,6,7,9,10,44,55};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    System.out.println(a[i]);
            }
        }
    }
}
