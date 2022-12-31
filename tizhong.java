import java.util.*;
public class tizhong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String []a=new String[50];
        int []b=new int[50];
        int []c=new int[50];
        int guopang=0,biaozhun=0,guoshou=0;
        People people1;
        for(int i=0;i<50;i++){
            a[i]=sc.nextLine();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            people1= new People(a[i], b[i], c[i]);
            if(people1.check()==1){
                guopang++;
            }else{
                if(people1.check()==-1){
                    guoshou++;
                }else{
                    if(people1.check()==0){
                        biaozhun++;
                    }
                }
            }
        }
        System.out.println("体重标准的人数是:"+biaozhun);
        System.out.println("体重超重的人数是:"+guopang);
        System.out.println("体重过瘦的人数是:"+guoshou);
    }
    static class People{
        private String name;
        private int weight;
        private int height;
        public People(String x,int y,int z){
            this.name=x;
            this.height=y;
            this.weight=z;
        }
        public int check(){
            if(this.height-110-this.weight>5){
                return 1;
            }else {
                if (this.height - 110 - this.weight < -5) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
