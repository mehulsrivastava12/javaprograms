package Abstraction;

abstract class Animal{
    public abstract void animalSleeping();

    public void eating(){
        System.out.println("The dog is eating");
    }
}

class Dog extends Animal{
    public void animalSleeping(){
        System.out.println("THe dog is sleeping");
    }
}
public class Main12 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.animalSleeping();
        d.eating();
    }    
}
