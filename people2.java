import java.util.*;
public class people2 {
    public static void main(String[] args){
        People people;
        people=new People();
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int m=sc.nextInt();
        people.setAge(m);
        people.setName(n);
        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
    static class People{
        String name;
        int age;
        public People(){
            this.name="无名氏";
            this.age=20;
        }
        public void setName(String a){
            this.name=a;
        }
        public String getName(){
            return this.name;
        }
        public void setAge(int b){
            this.age=b;
        }
        public int getAge(){
            return this.age;
        }
    }
}
