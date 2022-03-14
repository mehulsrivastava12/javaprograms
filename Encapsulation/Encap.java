package Encapsulation;

class Encapsulate{
    private String Name;
    private int RollNo;
    private int Age;

    public int getAge(){
        return Age;
    }

    public int getRollNo(){
        return RollNo;
    }

    public String getName(){
        return Name;
    }

    public void setName(String newName){
        Name=newName;
    }

    public void setRollNo(int newRollNo){
        RollNo=newRollNo;
    }

    public void setAge(int newAge){
        Age =newAge; 
    }
}

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
