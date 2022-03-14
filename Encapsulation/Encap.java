package Encapsulation;

public class Encap {
    public static void main(String[] args) {
        Encapsulate o=new Encapsulate();
        o.setName("Mehul");
        o.setAge(22);
        o.setRollNo(15);
 
        System.out.println("Name : " +o.getName());
        System.out.println("Age : " +o.getAge());
        System.out.println("RollNo : " +o.getRollNo());
 
     }
}
