import java.util.*;
public class shape {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[2][2];
        int []b=new int[2];
        int sumPerimeter;
        int sumArea;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        Rectangle rectangle1,rectangle2;
        Circle circle1,circle2;
        rectangle1= new Rectangle(a[0][0], a[0][1]);
        rectangle2= new Rectangle(a[1][0], a[1][1]);
        circle1= new Circle(b[0]);
        circle2= new Circle(b[1]);
        sumPerimeter= rectangle1.getPerimeter()+rectangle2.getPerimeter()+circle1.getPerimeter()+circle2.getPerimeter();
        sumArea=rectangle1.getArea()+rectangle2.getArea()+circle1.getArea()+circle2.getArea();
        System.out.println(sumPerimeter);
        System.out.println(sumArea);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(circle1);
        System.out.println(circle2);

    }
    static class Rectangle{
        private final int width;
        private final int length;

        public Rectangle(int m,int n){
            width=m;
            length=n;
        }
        public int getPerimeter(){
            return (width + length) * 2;
        }
        public int getArea(){
            return width * length;
        }
        public String toString(){
            return "Rectangle"+"[width="+width+",length="+length+"]";
        }
    }
    static class Circle{
        private final int radius;

        public Circle(int n){
            radius=n;
        }
        public int getPerimeter(){
            return (int) (Math.PI * 2 * radius);
        }
        public int getArea(){
            return (int) (Math.PI * radius * radius);
        }
        public String toString(){
            return "Circle"+"[radius="+radius+"]";
        }
    }
}
