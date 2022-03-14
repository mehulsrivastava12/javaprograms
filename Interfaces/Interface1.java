package Interfaces;

interface Vehicle{
    void ChangeGear(int a);
    void applyBreak(int a);
    void speedUp(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    public void ChangeGear(int newGear){
        gear=newGear;
    }

    public void applyBreak(int decrease){
        speed=speed-decrease;
    }

    public void speedUp(int increase){
        speed=speed+increase;
    }

    public void print(){
        System.out.println("Speed : " +speed+ " gear : " +gear);
    }
}
    class Bike implements Vehicle{
        int speed;
        int gear;

        public void ChangeGear(int newGear){
            gear=newGear;
        }

        public void applyBreak(int decrease){
            speed=speed-decrease;
        }

        public void speedUp(int increase){
            speed=speed+increase;
        }

        public void print(){
            System.out.println("Speed : " +speed+ " gear : " +gear);
        }
 }


public class Interface1 {
    public static void main(String[] args) {
        Bicycle bi=new Bicycle();
        bi.ChangeGear(2);
        bi.speedUp(3);
        bi.applyBreak(1);
        System.out.println("Bicycle :");
        bi.print();

        Bike b=new Bike();
        b.ChangeGear(1);
        b.speedUp(4);
        b.applyBreak(3);
        System.out.println("Bike");
        b.print();

    }
}
