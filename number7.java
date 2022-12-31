import java.util.SplittableRandom;

public class number7 {
    static class All{
        String name;
        All(String name){
            this.name=name;
        }
        public String charge(){
            return this.name+"is charging";
        }
        public String work(){
            return this.name+"is working";
        }
        public String eat(){
            return this.name+"is eating";
        }
    }
    static class Phone extends All{
        String name;
        Phone(String name){
            super(name);
            System.out.println("this is phone");
        }

    }
    static class Man extends All{
        String name;
        Man(String name ){
            super(name);
            System.out.println("this is man");
        }

    }
    static class Chicken extends All{
        Chicken(String name){
            super(name);
            System.out.println("this is chicken");
        }
    }

}
