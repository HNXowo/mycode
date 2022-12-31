import java.util.*;
public class Guess {
    public static void main(String args[]){
        int ans;
        Scanner kb=new Scanner(System.in);
        int key=(int)(Math.random()*20);
         int i=0;
        while(i<10){
            ans=kb.nextInt();
            i++;
            if(ans>20|| ans<=0){
            System.out.println("pls input a number between 0-20");
            System.exit(0);
            }
            if(ans==key){
            System.out.println("Congratulation!");
            break;

            }else{
                
            
            if(ans>key){
                System.out.println("too big!");
               
                }else{
                System.out.println("too small!");
               
                }
            
            }    
            
        }
        if(i==10){
            System.out.println("LOSE!"+"Do you want to know the answer?");
        int judge=kb.nextInt();
        if(judge==1){
            System.out.println("key is "+key);
        }else{
            if(judge==0){
                System.out.println("Bye Bye!");
            }
        }
        
        }
        
        
    }
}

    

