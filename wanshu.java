
public class wanshu {
    public static void main(String args[]){
       for(int i=1;i<=1000;i++){
        int result=0;
        for(int j=1;j<=i/2;j++){
            if(i%j==0){
                result+=j;
            }

        }
       if(result==i){
           System.out.println(i);
       }
       }
    }
}
