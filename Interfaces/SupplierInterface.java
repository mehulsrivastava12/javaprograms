package Interfaces;
import java.util.*;
import java.util.function.Predicate;


public class SupplierInterface {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("List","ListQuiz","OnGraph","Technologies","PVT. ", "LTD");

        Predicate<String> p=(s)->s.startsWith("L");
        for(String st:name){
            if(p.test(st)){
                System.out.println(st);
            }
        }
    }
}
