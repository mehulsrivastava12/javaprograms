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
