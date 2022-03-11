package EdabitHardLevelChallenges;

import java.util.Scanner;

public class RemoveWord {
    public static String remove(String Sentence, String word){
        if(Sentence.contains(word)){
            String temp=" " +word +" ";
            Sentence=Sentence.replaceAll(temp," ");
        }
        return Sentence;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the Sentence");
        String p=s.nextLine();
        System.out.println("Enter the word to remove");
        String q=s.nextLine();
        System.out.println(remove(p,q));
    }   
}
