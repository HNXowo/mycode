public class Vehicle {
    String run,color;
    Vehicle(String run,String color){
         this.color =color;
         this.run=run;
     }
     public String run(){
        return this.run;
     }
     public String showInfo(){
        return this.color;
     }
}
class Train extends Vehicle{
    String box;
    Train(String run,String color,String box){
        super(run, color);
        this.box=box;
    }
    public String showTrain(){
        return this.box;
    }
}
class Car extends Vehicle{
    String weight;
    Car(String run,String color,String weight){
        super(run, color);
        this.weight=weight;
    }
    public String showTruck(){
        return this.weight;
    }
}

