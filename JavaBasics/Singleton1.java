package JavaBasics;
class MySingleton{
    static MySingleton instance=null;
    public int x=10;
    
    private MySingleton(){

    }

    static public MySingleton getInstance(){
        if(instance==null){
            instance = new MySingleton();

        }
        return instance;
    }
}

public class Singleton1 {
    public static void main(String[] args) {
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        a.x=a.x+10;
        System.out.println("value of a.x is:" +a.x);
        System.out.println("value of b.x is:" +b.x);

    }
}
