import java.util.*;
public class dian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float []a=new float[4];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextFloat();
        }
        Point point;
        point=new Point(a[0],a[1]);
        System.out.println(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.move(a[2],a[3]);
        System.out.println(point);

    }
    static class Point{
        float x,y;
        public Point(){
            this.x=0;
            this.y=0;
        }
        public Point(float x,float y){
            this.x=x;
            this.y=y;
        }
        public void move(float x,float y){
            this.x+=x;
            this.y+=y;
        }
        public float getX(){
            return this.x;
        }
        public float getY(){
            return this.y;
        }
        public String toString(){
            return "坐标是:"+"("+this.x+","+this.y+")";
        }
    }
}
