import java.util.*;
public class xiangge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Date date1,date2;
        date1=new Date(x,y,z);
        date2=new Date(a,b,c);
    }
    static class Date{
        int year,month,day;
        int cha;
        public Date(){
            this.year=2000;
            this.month=1;
            this.day=1;
        }
        public Date(int year,int month,int day){
            this.year=year;
            this.month=month;
            this.day=day;
        }
        public int interval(Date b){
            if(this.year==b.year){
                if(this.month==b.month){
                    cha=Math.abs(this.day-b.day);
                }else{
                  cha=Math.abs(this.month-b.month-1)*30+b.day+30-this.day;
                }
            }else{
                cha=Math.abs(this.year-b.year-1)*365+Math.abs(this.month-b.month-1)*30+b.day+30-this.day;
            }
            return cha;
        }
    }
}
