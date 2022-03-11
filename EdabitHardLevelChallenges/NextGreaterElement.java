package EdabitHardLevelChallenges;

import java.util.Scanner;
import java.util.*;
  


public class NextGreaterElement {

    static void nextLargerElement(int[] arr, int n)
    { 
        Stack<Integer> s=new Stack<Integer>();
        int[] arr1=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <=arr[i]){
                s.pop();
            }
            if(s.empty()){
                arr1[i]=-1;
            }
            else{
                arr1[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    } 

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        nextLargerElement(arr,n);
    }
}
