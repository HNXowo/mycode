import java.util.*;
public class xuesheng {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();
        Student student;
        student=new Student();
        student.setRcord(a,b,c);
        System.out.println(student.getRecord());
    }
    static class Student{
        String xuehao;
        String name;
        int chengji;
        public Student(){

        }
        public void setRcord(String a,String b,int c){
            this.chengji=c;
            this.name=b;
            this.xuehao=a;
        }
        public int getRecord(){
            return chengji;
        }
    }
}
