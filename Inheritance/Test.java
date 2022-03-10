package Inheritance;


class Bicycle{
    public int gear;
    public int speed;
    
    public Bicycle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }
 
    public int applyBreak(int decrement){
       return (speed -= decrement);
    }
 
    public int speedUp(int increment){
        return (speed += increment);
    }
 
    public String toString(){
        return ("No of gears are" +gear+ "\n" + "Speed of bicycle is" +speed);
    }
 }
 
 class MountainBike extends Bicycle {
     public int seatHeight;
 
     public MountainBike(int gear,int speed,int starHeight){
         super(gear,speed);
         seatHeight=starHeight;
     }
 
     public void setHeight(int newValue){
         seatHeight=newValue;
     }
 
     public String toString(){
         return(super.toString() + "\nseat height is" +seatHeight);
     }
 }
 
 public class Test {
     public static void main(String[] args) {
         MountainBike mb =new MountainBike(3,100,40);
         System.out.println(mb.toString());
         System.out.println(mb.applyBreak(100));
        }
 }