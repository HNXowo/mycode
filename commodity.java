import java.util.*;
public class commodity {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b=sc.nextLine(),c=sc.nextLine(),d=sc.nextLine(),e=sc.nextLine(),f=sc.nextLine(),g=sc.nextLine(),h=sc.nextLine();

        Food food=new Food(a,b,c,d,f);
        Cloth cloth=new Cloth(a,e,f,g,h);

    }
    static class Sell{
        String number,name,date,fac;
        Sell(String number,String name,String date,String fac){
            this.fac=fac;
            this.number=number;
            this.name =name;
            this.date=date;
            System.out.println("on sale");
        }
        public String toString(){
            return this.number+this.name+this.date+this.fac;
        }
    }
    static class Food extends Sell{
        String endingDate;
        Food(String number, String name, String date, String fac,String endingDate) {
            super(number, name, date, fac);
            this.endingDate=endingDate;
            System.out.println("this is food");
        }
        public String toString(){
            return this.number+this.name+this.date+this.fac+this.endingDate;
        }
    }
    static class Cloth extends Sell{
         String clothes;
        Cloth(String number, String name, String date, String fac,String clothes) {
            super(number, name, date, fac);
            this.clothes=clothes;
            System.out.println("this is clothes");
        }
        public String toString(){
            return this.number+this.name+this.date+this.fac+this.clothes;
        }
    }
}
